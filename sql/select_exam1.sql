-- 221013
-- Select 문제풀이
-- EMP 테이블과 DEPT 테이블을 이용해서 풀이해 주세요.


-- 1. 덧셈연산자를 이용하여 모든 사원에 대해서 $300의 급여 인상을 계산한 후 사원의 이름, 급여, 인상된 급여를 출력하시오.
select ename,sal, sal + 300 as add_sal
from emp;

-- 2. 사원의 이름, 급여, 연간 총 수입을 총 수입이 많은 것부터 작은 순으로 출력하시오, 연간 총수입은 월급에 12를 곱한 후 $100의 상여금을 더해서 계산하시오.​
select ename,sal,(sal*12)+100 as annul_sal
from emp
order by annul_sal desc;
-- 3. 급여가 2000을 넘는 사원의 이름과 급여를 표현, 급여가 많은 것부터 작은 순으로 출력하시오.
select ename,sal
from emp
where sal >= 2000
order by sal desc;

-- 4. 사원번호가 7788인 사원의 이름과 부서번호를 출력하시오.
select ename,deptno
from emp
where empno = 7788;

-- 5. 급여가 2000에서 3000 사이에 포함되지 않는 사원의 이름과 급여를 출력하시오.
select ename,sal
from emp
where sal between 2000 and 3000;

-- 6. 1981년 2월 20일 부터 1981년 5월 1일 사이에 입사한 사원의 이름, 담당업무, 입사일을 출력하시오.
select ename, job,hiredate
from emp
where hiredate BETWEEN '81/2/20' and '81/5/1';

-- 7. 부서번호가 20 및 30에 속한 사원의 이름과 부서번호를 출력, 이름을 기준(내림차순)으로 영문자순으로 출력하시오.
select ename,deptno
from emp
where deptno BETWEEN 20 and 30
order by ename desc;

-- 8. 사원의 급여가 2000에서 3000사이에 포함되고 부서번호가 20 또는 30인 사원의 이름, 급여와 부서번호를 출력, 이름순(오름차순)으로 출력하시오.
select ename, sal,deptno
from emp
where sal BETWEEN 2000 and 3000 or deptno=20 or deptno=30
order by ename ;

-- 9. 1981년도에 입사한 사원의 이름과 입사일을 출력하시오. (like 연산자와 와일드카드 사용)
select ename,hiredate
from emp
where hiredate like '%1981%';

-- 10. 관리자가 없는 사원의 이름과 담당 업무를 출력하시오.
select ename,job
from emp
-- where mgr is not null; -- null인경우를 찾아야 하는데 null이 아닌 경우의 답을 입력함.(오답)
where mgr is null;

-- 11. 커미션을 받을 수 있는 자격이 되는 사원의 이름, 급여, 커미션을 출력하되 급여 및 커미션을 기준으로 내림차순 정렬하여 표시하시오.
select ename,sal,comm
from emp
-- where comm is not null -- 틀린답은 아니지만 comm !=0 을 넣어주면 좀 더 정확하게 할 수 있다. 
where comm is not null and comm !=0 
order by comm desc;

-- 12. 이름의 세번째 문자가 R인 사원의 이름을 표시하시오.
SELECT *
from emp
where ename like '__R%';

-- 13. 이름에 A와 E를 모두 포함하고 있는 사원의 이름을 표시하시오.
select ename
from emp
-- where ename like '%A%E%'; -- A가 무조건 먼저 나와야 하는 패턴(오답)
where ename like '%A%' and ename like '%E%';

-- 14. 담당업무가 CLERK, 또는 SALESMAN이면서 급여가 $1600, $950 또는 $1300이 아닌 사원의 이름, 담당업무, 급여를 출력하시오.
select ename,job,sal
from emp
-- where job='CLERK' or job='SALESMAN' and not sal in(1600,950,1300); // 앞 조건에 ()을 해줘야 해당사항에 맞는 답이 나오고 안해주면 모든 CLERK가 나와서 (오답), not의 위치의 경우 not sal in ,sal not in 둘다 맞는표현
where (job='CLERK' or job='SALESMAN') and not sal in(1600,950,1300);

-- 15. 커미션이 $500 이상인 사원의 이름과 급여 및 커미션을 출력하시오.
select ename,sal,comm
from emp
where comm >=500;