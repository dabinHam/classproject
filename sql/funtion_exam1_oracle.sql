-- 221014 
-- Oracle 함수 풀이

-- 함수 문제 1

-- 16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
SELECT HIREDATE, SUBSTR(HIREDATE, 1, 5), SUBSTR(HIREDATE, 1, 2), SUBSTR(HIREDATE, 4, 2)
FROM EMP;


-- 17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
SELECT *
FROM EMP
WHERE SUBSTR(HIREDATE, 4, 2) = '04';
-- WHERE TO_NUMBER(SUBSTR(HIREDATE, 4, 2), '99') = 4;


-- 18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
SELECT *
FROM EMP
WHERE MOD(EMPNO, 2) = 0;


-- 19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
SELECT ENAME, 
       TO_CHAR(HIREDATE, 'YY') AS "입사 년도", 
       TO_CHAR(HIREDATE, 'MM') AS "입사 월", 
       TO_CHAR(HIREDATE, 'DY') AS "입사 요일",
       TO_CHAR(HIREDATE, 'YY.MM, DY') AS "입사 년도/월/요일"
FROM EMP;


-- 20. 올해 몇 칠이 지났는지 출력하시오. 
-- 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
-- TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
SELECT TRUNC(SYSDATE - TO_DATE('2022/01/01')) AS "현재 이번 년도의 일수"
FROM DUAL;


-- 21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
SELECT NVL(MGR, 0)
FROM EMP;

-- 22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 
-- 직급이 ‘ANALIST”인 사원은 200, 
-- ‘SALESMAN’인 사원은 180, 
-- ‘MANAGER’인 사원은 150, 
-- ‘CLERK”인 사원은 100을 인상하시오.
SELECT ENAME, JOB, SAL,
       DECODE(JOB, 'ANALYST', SAL + 200, -- job='ANALYST' 일때 처리가 되는것. 
                   'SALESMAN', SAL + 180,
                   'MANAGER', SAL + 150,
                   'CLERK', SAL + 100
       ) AS UP_SAL
FROM EMP;


-- group by : excel처럼 테이블형식으로 만들어서 많이 사용할수있는 듯 ,  유형별로 나눠야 할것같으면 무조건 group by! 
-- 24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오.
SELECT JOB, MAX(SAL), MIN(SAL), SUM(SAL), ROUND(AVG(SAL))
FROM EMP
where empno>0
GROUP BY JOB;

select distinct job from emp;

-- 25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오. (= 직급별로 몇 명인지 출력하라는 질문)
SELECT JOB, COUNT(*) -- COUNT(*)에 값을 넣기전에 고민해보기 null 이 있는지 없는지 (null은 제외되기때문에) , 
FROM EMP
GROUP BY JOB;



-- 26. 관리자 수를 출력하시오.
-- mgr => 상관의 사원번호 empno
-- mgr 컬럼에 있는 사원번호 관리자들 

select count(distinct mgr) from emp order by mgr;
-- SELECT COUNT(DISTINCT MGR)
-- FROM EMP;



-- 27. 급여 최고액, 급여 최저액의 차액을 출력하시오.
SELECT MAX(SAL), MIN(SAL), MAX(SAL) - MIN(SAL)
FROM EMP;


-- 28. 직급별 사원의 최저 급여를 출력하시오. 
-- 관리자를 알 수 없는 사원과 => where
-- 최저 급여가 2000 미만인 그룹은 제외시키고 => having 
-- 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.
SELECT MIN(SAL)
FROM EMP
WHERE MGR IS NOT NULL -- = null 이 아니여야한다. ( group의 대상이 되야하는건 where절)
GROUP BY JOB
-- HAVING NOT MIN(SAL) < 2000 -- | < , >= 기획자의 의도에 따라 달라질 수 있다.
HAVING NOT MIN(SAL) >= 2000 -- (group의 결과와 조건을 가지는건 having절)
ORDER BY MIN(SAL) DESC;



-- 29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오.
-- 평균 급여는 소수점 둘째 자리로 반올림 하시오.
SELECT DEPTNO, COUNT(*), ROUND(AVG(SAL), 2) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

select * from dept; -- 지역명확인

-- 30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 반올림 하시오. DECODE 사용.
SELECT DECODE(DEPTNO, 10, 'ACCOUNTING',
                      20, 'RESEARCH',
                      30, 'SALES',
                      40, 'OPERATIONS'
       ) AS DNAME,
       DECODE(DEPTNO, 10, 'NEW YORK',
                      20, 'DALLAS',
                      30, 'CHICAGO',
                      40, 'BOSTON'
       ) AS LOC,
       COUNT(*) AS "사원 수", ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY AVG(SAL);



-- JOIN을 사용한 해결
SELECT DEPT.DNAME, DEPT.LOC, COUNT(*), ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO -- 여기까지 join이 된 행 , '행'들에 대한 결과

GROUP BY DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC -- 어떤식으로 group을 할건지 , 행 들에대한 결과를 묶는 것
ORDER BY AVG(SAL);



-- 31. 업무를 표시한 다음 해당 업무에 대해 부서 번호별 급여 및 부서 10, 20, 30의 급여 총액을 각각 출력하시오. 
-- 별칭은 각 job, dno, 부서 10, 부서 20, 부서 30, 총액으로 지정하시오. 
-- ( hint. Decode, group by )

-- select job,deptno as dno
-- from emp
-- group by job,deptno;

-- select job,deptno as dno, sum(sal)
-- from emp
-- group by job,deptno;

-- select job,deptno as dno, 
--     0 as "부서10", 
--     0 as "부서20" , 
--     0 as "부서30" , 
--     sum(sal) as "총액"
    
select job,deptno as dno, 
	0 as "부서10", 
    0 as "부서20" , 
    0 as "부서30" , 
    sum(sal) as "총액"
    
from emp
group by job,deptno
order by deptno;




SELECT JOB, DEPTNO,
       DECODE(DEPTNO, 10, SUM(SAL)) AS "부서10",
       DECODE(DEPTNO, 20, SUM(SAL)) AS "부서20",
       DECODE(DEPTNO, 30, SUM(SAL)) AS "부서30",
       SUM(SAL)
FROM EMP
GROUP BY JOB, DEPTNO
ORDER BY DEPTNO;