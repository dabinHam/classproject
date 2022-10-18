-- 221018

-- Join, SubQuery 

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
-- (5) 박지성이구매한도서의출판사수
select count(DISTINCT publisher)
from book
;

select count( DISTINCT publisher) -- distinct를 꼭 넣어줘야 맞음. 
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성';

select * 
from orders o , book b
where o.bookid=b.bookid and custid = (select custid from customer where name ='박지성');

-- (6) 박지성이구매한 도서의이름, 가격, 정가 와 판매가격의 차이
-- 박지성 : customer | 도서의이름, 가격 : book | 정가,판매가격 : orders
-- 고객들이 구매한 도서
select name, bookname, price, saleprice
from orders o , book b, customer c 
where o.bookid=b.bookid and o.custid=c.custid
;

-- 박지성이 구매한 도서
select name, bookname, price, saleprice
from orders o , book b, customer c 
where o.bookid=b.bookid and o.custid=c.custid
and name = '박지성'
;

-- 정가와 판매가의 차이 : 'price-saleprice'
select name, bookname, price, saleprice , price-saleprice as gapprice
from orders o , book b, customer c 
where o.bookid=b.bookid and o.custid=c.custid
and name = '박지성'
;

-- (7) 박지성이구매하지않은도서의이름
select bookname
from book
where bookid not in (서브쿼리)
;

-- 박지성이 구매한 내역
select distinct bookid
from orders o, customer c
where o.custid=c.custid and name = '박지성'
;

select bookid,bookname
from book
where bookid not in (select distinct bookid
from orders o, customer c
where o.custid=c.custid and name = '박지성')
;


-- ​2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
-- (8) 주문하지않은고객의이름(부속질의사용)
select distinct custid from orders; --  구매고객

-- 주문하지않은 고객
select *
from customer
where custid not in (select distinct custid from orders)
;

-- EXISTS 사용
-- 구매고객
select *
from customer c
where EXISTS (select * from orders o where c.custid=o.custid)
;
-- 주문하지않은 고객
select *
from customer c
where EXISTS (select * from orders o where c.custid=o.custid)
;

select *
from customer c, orders o
where c.custid=o.custid(+) and o.orderid is null -- (+)은 Oralcle 에서만 사용이 가능하다 
;

-- MySQL
select *
from customer c left outer join orders o
on c.custid=o.custid
where o.orderid is null
;


-- (9) 주문금액의총액과주문의평균금액

select sum(saleprice),avg(saleprice)
from orders;

-- (10) 고객의 이름과 고객별 구매액
select c.custid, c.name, sum(saleprice) as total
from orders o , customer c
where o.custid=c.custid
group by c.custid, c.name 
order by c.custid
;

-- (11) 고객의 이름과 고객이 구매한 도서 목록
select name, bookname
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid;

-- (12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
select orderid ,price, saleprice, price-saleprice
from orders o,book b
where o.bookid = b.bookid and price-saleprice = (
		select max(price-saleprice)
		from orders o, book b
		where o.bookid=b.bookid)
;

select max(price-saleprice)
from orders o, book b
where o.bookid=b.bookid
;

-- (13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
select c.custid , name , avg(saleprice)
from customer c, orders o
where o.custid = c.custid
group by c.custid,name
having avg(saleprice) > (select avg(saleprice) from orders)
order by c.custid
;


-- ​3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select DISTINCT publisher
from orders o, customer c , book b
where o.custid = c.custid and o.bookid = b.bookid
and name = '박지성'
;


select *
from orders o, customer c , book b
where o.custid = c.custid and o.bookid = b.bookid
and name = '박지성'
;

select *
from orders o, customer c , book b
where o.custid = c.custid and o.bookid = b.bookid
and publisher in (select distinct publisher
				from orders o, customer c , book b
                where o.custid = c.custid and o.bookid = b.bookid   
				)
                
;



-- ​(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

select o.custid, name, count(distinct publisher)
from orders o,customer c, book b
where o.custid=c.custid and o.bookid = b.bookid
group by o.custid, name
having count(distinct publisher) > 3
;