-- 20221013
-- group function 그룹함수(=집합함수, 집계함수, 다중행 함수)
-- sum, avg, count, max, min

-- 회사의 모든 사원의 급여 총액 : 월 지출 액
select sum(sal)
from emp;

-- 커미션 총액
select sum(comm), count(comm), avg(comm) -- count(행의갯수) : null을 제외한 갯수를 말한다.
from emp;

-- 급여 평균
-- select avg(sal) -- 결과값이 2021.666667 너무 길어서 round 함수를 사용하여 줄여주기
select round (avg(sal),2)
from emp;

-- 최고 급여 찾기
select max(sal)
from emp;

-- 최저 급여 찾기
select min(sal)
from emp;

-- 전체 사원의 수
select count(*) from emp;

-- 부서의 개수
select count(*) from dept;

-- 보유한 책의 개수, 고객의 수, 판매 횟수 
select *
from book;

-- 직급의 수
select count(distinct job) -- distinct를 잘 활용하면 매우좋다 ! 
from emp;

select distinct job from emp;

-- group by => 특정 컬럼 값을 기준으로 그룹핑
select sum(sal),count(*) from emp where deptno=10;

-- trunc(Oracle) truncate(MySQL) , trunc(avg(sal)) = truncate(avg(sal),2) truncate는 꼭 2를 넣어줘야한다
-- groub by, having
select deptno, count(*), sum(sal), truncate(avg(sal),2), max(sal),min(sal) 
from emp
group by deptno
-- 부서별 평균 급여가 2000 이상인 부서의 데이터만 출력
having avg(sal)>= 2000;

-- 부서의 최대값과 최소값을 구하되 최대 급여가 2900 이상인 부서만 출력합니다.
select deptno,max(sal),min(sal)
from emp
group by deptno
having max(sal) >= 2900;

-- 직급별 
select job 
	, count(*) -- 직급별 인원수 구하기 
from emp
group by job;