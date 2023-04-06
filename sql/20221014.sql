-- 20221014

-- decode(Oracle) = If(MySQL)
	-- if(조건, true, false)
    -- 별칭인 경우 ""을 쓰는것이 좋다. ''은 문자열에 사용하기 !  특히 한글별칭 지양하기! 나중에 문제생길 수 있음. 
select 
	job,
    deptno,
    sum(sal),
	if(deptno=10, sum(sal),null) as "부서10",
	if(deptno=20, sum(sal),null) as "부서20",
	if(deptno=30, sum(sal),null) as "부서30"
    from emp
    group by job,deptno
    order by deptno;
    
    -- decode 함수 => 여러가지 비교를 통해 결과 출력 switch-case 유사
select 
	ename,
    deptno,
    decode(	deptno, 10, 'ACCOUNTING'
				  , 20, 'RESEARCH'
				  , 30, 'SALES'
				  , 40, 'OPERATIONS'
    ) as dname
from emp;

select distinct job from emp; -- 확인을 하기 위한 select , distinct를 써줌으로 중복없이 결과값이 출력되었다.

-- 직급에 따라 급여를 인상하도록 하자. 직급이 'ANALYST'인 사원은 5%, 'SALESMAN'인 사원은 10%, 'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다.
-- nvl(Oracle) = ifnull(MySQL)
select 
	ename, job, sal,
    nvl(
	decode (job, 'ANALYST', sal*1.05
				, 'SALESMAN',  sal*1.1
				, 'MANAGER',  sal*1.5
				, 'CLERK',  sal*1.2
    )
    ,sal) as upSal
from emp;
    
-- case ~ whden ~ then

select ename, deptno,
	case when deptno=10 then 'accounting'
		when deptno=20 then 'research'
		when deptno=30 then 'sales'
		when deptno=40 then 'operations'
	end as dname 
    from emp; 
    
-- ----------------------------------------------------------------------------------------------------

-- join : 관계있는 테이블의 스키마를 붙이는 것
select * 
from emp, dept
where emp.deptno = dept.deptno;  -- 매칭되는것만 남김

select emp.ename, dept.dname -- 내부에 같은게 없어서 상관이 없지만 emp. | dept. 앞에 붙혀주는것이 좋다.
from emp, dept
where emp.deptno = dept.deptno;  -- decode(=if)절을 사용하는 대신 사용 할 수 있다.

-- table 별칭을 이용해서 컬럼(deptno) 구별 
select e.ename, d.dname -- 별칭을 사용한 이 형태가 제일 많이 쓰인다! 
from emp e, dept d
where e.deptno = d.deptno; 

-- Oracle,MySQL
-- ineer join을 사용할때엔 꼭 on을 붙혀줘야한다. 
select *
from emp inner join dept
on emp.deptno=dept.deptno;

-- inner 생략 가능
select *
from emp join dept
on emp.deptno=dept.deptno;

-- 별칭 사용
select *
from emp e inner join dept d
on e.deptno=d.deptno;
-- 열의 정의가 애매하다 라는 error가 뜬 경우 앞에 스키마(emp.)를 붙혀줘야한다. 

-- 14 * 4 => cross join의 결과 행
select *
from emp cross join dept;


-- self Join : 자기 자신의 테이블과 조인
-- emp => mgr : 상사의 사원번호
-- 각 사원들의 상사의 이름을 출력

select ename , mgr from emp;
select ename from emp where empno = 7839; -- 하나하나씩 출력해줘야 하기때문에 계속 select를 호출하여 써야한다. 

select *
from emp e1, emp e2
where e1.mgr=e2.empno;

select e1.ename as "사원이름", e2.ename as "상사이름"
from emp e1, emp e2
where e1.mgr=e2.empno;

-- (+) 는 Oracle에서만 사용이 가능하다. (+) 대신 outer join
-- select e1.ename as "사원이름", e2.ename as "상사이름"
-- from emp e1, emp e2
-- where e1.mgr=e2.empno(+);

-- outer join : 조건에 맞지 않더라도 출력하고 싶은 객체에 left | right 를 적용하여 (null을) 나타낸다.
select e1.ename, e2.ename
from emp e1 left outer join emp e2 -- 조건에 맞지 않더라도 출력하고싶은 객체쪽에 outer join
on e1.mgr=e2.empno;

select e1.ename, e2.ename
from emp e1 right outer join emp e2 -- 표시하고자하는 대상객체에 right | left 
on e1.empno=e2.mgr;

-- using
select deptno
from emp e inner join dept d
using(deptno);

-- NATURAL JOIN : 두 테이블에 각각 조인을 정의한 컬럼의 이름이 동일하다면 USING절 에서 조인할 컬럼을 지정하여 구문을 더 간단하게 표현할 수 있습니다.
select *
from emp NATURAL JOIN dept;

-- 'SCOTT' 사원의 사원번호와 이름 직급 부서이름 부서위치를 출력
-- emp => 사원번호, 이름, 직급
-- dept => 부서 이름, 위치

-- 방법1
select empno, ename, job, dname, loc
from emp e, dept d
where e.deptno=d.deptno
	and e.ename='SCOTT';
-- 방법2
select empno, ename, job, dname, loc

from emp e join dept d -- join 에 대한 조건
on e.deptno=d.deptno -- join 에 대한 조건

where ename='SCOTT';



-- salgrade 테이블을 참조해서 사원들의 사번, 이름, 급여, 급여등급을 출력
-- 사번, 이름, 급여 = emp | 급여등급 = salgrade
select * from salgrade;

select *
from emp e, salgrade s;
-- where e.sal between s.losal and s.hisal; -- 이걸 안적으면 70개 적으면 14개의 행이 나오는게 맞음

select ename, losal, sal, hisal , grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

-- mysql
select ename, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;

-- 판매내역 : 판매정보(orders), 판매서적의 정보(book), 고객의 정보(customer)
desc orders; -- custid, bookid = 외래키
desc customer;

select orders.orderdate, customer.name, book.bookname, book.price, orders.saleprice
from book, customer, orders -- orders 가 들어간건 판매내역을 확인하기 위하여
where orders.custid=customer.custid and orders.bookid=book.bookid

order by orders.orderdate desc	-- 날짜순으로 정렬 , desc로 정렬하면 최근에 팔린 날짜순서로 정렬할 수 있다. 
;

select * from orders;

-- mysql '박지성'이름의 고객이 구매한 내역
select o.orderdate, c.name, b.bookname, b.price, o.saleprice 
from orders o join customer c
on o.custid=c.custid
join book b
on o.bookid=b.bookid
where name='박지성'
;
-- mysql  고객별 구매횟수 출력
select c.name, count(*) as "구매횟수" 
from orders o join customer c
on o.custid=c.custid
join book b
on o.bookid=b.bookid
group by c.name
;


select *
from emp,dept
where emp.deptno=deptno
;

select *
from emp cross join dept
where emp.deptno=deptno;