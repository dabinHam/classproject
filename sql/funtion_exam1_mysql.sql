-- 221014 
-- MySQL 함수 풀이

-- 함수 문제 1

SELECT DEPTNO, COUNT(*) AS "사원 수", ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY AVG(SAL);


-- 22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 직급이 ‘ANALIST”인 사원은 200, ‘SALESMAN’인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오.

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

SELECT JOB, DEPTNO, SUM(SAL),
	   -- if(조건, true, false)
       if(DEPTNO=10, SUM(SAL), null) AS "부서10",
       if(DEPTNO=20, SUM(SAL), null) AS "부서20",
       if(DEPTNO=30, SUM(SAL), null) AS "부서30"
FROM EMP
GROUP BY JOB, DEPTNO
ORDER BY DEPTNO;



