-- 20221012

-- 사용가능한 테이블정보
select * from tab;

-- 테이블의 구조 확인
desc dept;

select * -- ename -- * 
from emp ;

select deptno, job, sal, ename
from emp ;

-- select [distinct] 컬럼 이름, 컬럼이름, ... // []는 생략가능. 
-- from 테이블의 이름  


select * from dept; -- 행을 선택하는 조건이 없기 때문에 모든 행이 결과로 출력 
select deptno, dname from dept;  

select sal, comm from emp;

-- null : 정해지지 않은값!

-- select 의 표현영역에서는 산술연산이 가능하다.
select sal + comm
from emp;

select sal, sal - 100 
from emp; 

select sal * 12
from emp;

select sal / 12 
from emp;


-- 사원 테이블에서 사원의 이름, 월 급여, 연봉을 출력
select ename, sal , sal*12
from emp;

select ename, sal , sal*12 , sal*12+comm
from emp;

-- null의 값을 치완해주는함수 : nvl(원본데이터, null 일때 치환되는 값)
select ename, sal , sal*12 , sal*12+nvl * (comm,0) as yearSal2
from emp;

-- 문자열 연산
select ename || ' is a ' || job
from emp;

select concat(ename, ' is a ',job)
from emp;

-- distinct : 중복된 데이터를 생략하고 출력
select deptno
from emp;

select distinct deptno
from emp;

-- 행을 찾는 조건
-- select
-- from
-- where 조건식 <- 행을 찾는 조건식 
-- 급여를 3000 이상 받는 사원의 리스트 
-- ( 조건식을 만들때에는 조건을 명확하게 파악하는것이 중요하다 )
select *
from emp;

select *
from emp
where sal >= 3000;

-- 부서테이블에서 부서번호가 10번인 사원의 리스트를 출력 
-- deptno=10
select *
from emp;

select *
from emp
where deptno=10; 


-- 10번 부서 소속이 아닌 사원들의 리스트 출력
select *
from emp
where deptno <> 10;

-- 이름으로 검색 => 문자열:작은따옴표로 표시
-- ename='SCOTT'
-- 이름이 SCOTT인 사원의 정보를 출력
select *
from emp
where ename = 'SCOTT'; -- 저장된 문자열의 데이터는 대소문자를 구별하기 때문에 주의하자!! 그래서 함수를 사용하여 전부 대문자나 소문자로 변경시켜서 통일시키는경우가 있다. 

select*
from emp
where hiredate = '81/11/17'; -- 날짜 비교시에도 작은따옴표를 사용하여 문자열 비교를 해줘야 한다. 

-- 논리 연산
-- => 비교연산을 여러개 사용해서 결과를 만든다!
-- and, or, not

-- 10번 부서의 매니저(직급)을 검색하자 ! emp
select *
from emp
where deptno=10 and job='MANAGER' ;

-- 10번 부서에 소속한 사원들과 매니저들을 출력 or
select *
from emp
where deptno=10 or job ='MANAGER';


-- 10번 부서 소속이 아닌 사원들의 리스트 출력 not , not는 앞에 사용됨₩
select *
from emp
where not deptno=10; -- 논리부정(not)결과 


-- 10번 부서 소속인 사원들 중에서 직급이 MANAGER인 사람을 검색하여 
-- 사원명, 부서번호, 직급을 출력하려고 한다면 두 가지 조건을 제시해야 합니다.
select ename, deptno, job	-- 사원명, 부서번호, 직급 
from emp
where deptno = 10 and job='MANAGER';	-- 10번부서인 사원중 직급이 MANAGER 


-- 10번 부서에 소속된 사원이거나 직급이 MANAGER인 사람을 검색하여 
-- 사원명, 부서번호, 직급을 출력합시다.
select ename, deptno, job
from emp
where deptno = 10 or job = 'MANAGER';

-- 2000에서 3000 사이의 급여를 받는 사원의 리스트
select * 
from emp
where sal >=2000 and sal <= 3000;

select * 
from emp
where sal between 2000 and 3000; -- 좀 더 직관적이다. 

-- 1987년에 입사한 사원 리스트 
select *
from emp
where hiredate between'87/01/01' and '87/12/31';

-- 커미션이 300 이거나 500 이거나 1400인 사원을 검색하기
select *
from emp
where comm=300 or comm=500 or comm=1400; 	-- null(0)은 비교값이 나오지 않는다. 

select *
from emp
where comm in (300, 500, 1400, 0); -- or검색을 해야하는 데이터를 () 에 넣어준다.


-- 이름 검색 : ename = 'SCOTT' -- 한글자라도 빠지면 검색이 안됨.  근데 만약 내가 'SC'만 쳐서 검색을 하고싶으면(키워드검색) 
-- 키워드검색 : ename = 'SC' 
-- like 패턴 검색

-- 이름을 'F'로 시작하는 이름을 검색 
select *
from emp
where ename like '%S' ; -- '%'가 뒤에있으면 뭐가오든 몇개가오든 안와도 상관없다는 뜻 , 만약 '%'가 앞에 붙어있다면 무조건 S로 끝난다. 

select *
from emp
where ename like 'F%' ; -- F로 시작하거나 F만 있는경우.

select *
from emp
where ename like '%F%' ; -- F 를 포함 하고 있는 것을 찾는다. 

-- 이름의 두 번째 글자가 A인사원 검색

select*
from emp
where ename like '__A%'; 	 -- 3번째 자리에 A가 있는것 

select *
from emp
where not ename like '%A%'; -- A가 들어가지 않는 검색
 

-- null 여부를 확인하는 is null
-- 비교연산자를 사용할 수 없다 !! = null X

-- 커미션을 받지 않는 사원
select *
from emp
-- where comm=null; -- null과 비교하면 무조건 false 가 나온다.  
where comm is null or comm=0;

-- 커미션이 등록된 사원의 리스트 
select *
from emp
where comm is not null ; 


-- 결과 행의 정렬 : order by 컬럼 asc | desc
-- asc : 오름차순, 생략하면 기본값 
-- desc : 내림차순

-- 급여 컬럼을 기준으로 오름차순으로 정렬해보자 
select *
from emp
-- where -- order by 전. where 가 먼저 들어간다. 결과를 다 만들어 놓고 진행해야함. 
-- order by sal asc; -- 오름차순
-- order by sal ; -- 생략해도 똑같다. 
order by sal desc ; -- 내림차순 

-- 사원 리스트를 이름 순으로 출력
select *
from emp
-- order by ename; -- (asc 생략)  A ~ Z 
order by ename desc; --  Z ~ A


-- 입사일이 가장 오래된 사원 순으로 사원의 리스트를 출력 (오름차순)
select *
from emp
order by hiredate;

-- 가장 최근 입사자 부터 출력하는 리스트 (내림차순)
select *
from emp
-- order by hiredate desc;
-- order by hiredate desc, job asc;-- 가장 최근 입사자 순(desc : 내림차순) + 동일한 입사날짜인 경우 job을 오름차순(A~Z)으로 만들어 두는것. 
order by sal, ename desc; -- 연봉이 적은 (내림차순) 일때 사용한다. 
