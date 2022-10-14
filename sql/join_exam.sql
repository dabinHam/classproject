-- 20221014
-- Join 문제

-- 32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.
-- scott사원이름 = emp | 부서번호, 부서이름 = dept
select * from emp;
select * from dept;

select e.ename, d.deptno, d.dname
from emp e,dept d
where e.deptno=d.deptno
and e.ename='SCOTT';


-- 33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
-- 사원이름-ename = emp | 부서이름-dname, 지역명-loc = dept
select * from emp;
select * from dept;

select e.ename, d.dname, d.loc
from emp e join dept d
on e.deptno=d.deptno
order by loc;
-- 36. 조인과 WildCARD를 사용하여 이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
-- 'A'가 포함된 이름 = emp.ename | 부서명 = dept.dname
select e.ename, d.dname
from emp e join dept d
on e.deptno=d.deptno
where ename like '%A%';

-- 37. JOIN을 이용하여 NEW YORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
-- (NEW YORK에 근무하는=)지역,부서번호,부서명 = d.loc,d.deptno,d.dname | 이름,업무 = e.ename, e.job
select d.loc, e.ename,e.job,d.deptno,d.dname 
from emp e join dept d
on e.deptno=d.deptno
where d.loc='NEW YORK';

-- 38. SELF JOIN을 사용하여 사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select e1.ename as "사원", e1.empno as "사원번호", e2.mgr as "관리자"
from emp e1,emp e2
where e2.mgr=e1.empno
;

-- 39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select  e1.empno as "사원번호", e1.ename as "사원", e2.mgr as "관리자"
from emp e1 left outer join emp e2
on e2.mgr=e1.empno
;

-- 40. SELF JOIN을 사용하여 지정한 사원의 이름, 부서번호, 지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )
select e1.ename as "지정 사원",e1.deptno as "부서번호",e2.ename as"찾은 사원"
from emp e1, emp e2
where e1.deptno= e2.deptno
	and e1.ename='SCOTT'
;

-- 41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select e1.ename as "사원1", e1.hiredate as "사원1 입사일자" , e2.ename as "사원2" , e2.hiredate as "사원2 입사일자"
from emp e1, emp e2
where e1.hiredate < e2.hiredate
	and e1.ename='WARD'
order by e2.hiredate ;

select distinct ename,hiredate from emp order by hiredate;

-- 42. SELF JOIN 을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오.
select e1.mgr ,e1.ename as "사원 이름" , e1.hiredate as "사원 입사일",e2.empno, e2.ename as "관리자 이름", e2.hiredate as "관리자 입사일"
from emp e1, emp e2
where e1.mgr = e2.empno;

select * from emp;