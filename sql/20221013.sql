-- 20221013
-- or 와 같이 사용하는 in()의 경우 범위가 확장 될 것 같을때 사용하는것이 좋다. 

-- 함수 : 단일행 함수(컬럼하나를 대상으로 하는 함수), 집합 함수 
select ename, sal, ifnull(comm, 0) as comm
from emp
where comm >= 0;

-- 문자 함수
select lower('SCOTT') from dual; -- dual ? 사용하는 함수나 수식들을 활용하고 테스트 해볼때 사용할 수 있는 임시테이블 = 더미테이블
select ename, lower(ename) from emp; -- 소문자로 변환하는 함수 lower()

select upper('scott') from dual; -- 대문자로 변환해주는 함수 upper
select initcap('scott') from dual; -- 제일 앞 글자만 대문자료 변환해주는 함수 initcap (오라클에서만 가능 ) 

-- substr (원본, 시작포인트, 반환할 개수) : 특정 문자열을 잘라서 가져오는 함수
select substr('안녕하세요. 손흥민입니다.', 2, 8) from dual;
select substr('안녕하세요. 손흥민입니다.', 5) from dual; 

select length('안녕하세요 손흥민입니다.') from dual; -- 문자열의 갯수 출력 

-- lpad, rpad 특정 자리수 지정하고 자리수에 데이터가 없는경우 특정 패턴으로 채우는 함수 
-- lpad : left | rpad : right
-- 00010, 00020, 00030, 00040
select dname, deptno, lpad(deptno, 5, '0') , rpad(deptno, 5, 'A') -- 5자리를 만들어놓고 원래 데이터가 가지는 자리수는 그대로 유지 후 나머지를 채움. 
from dept;

-- trim 을 사용하여 공백처리
select '   ABC', trim('   ABC') ,'ABC     ', trim('ABC     '),'ABC          ', trim('ABC          '),'    ABC    ', trim('   ABC    ')
from dual;

-- replace(원본,제거할 문자, 삽입할문자)
select replace('Steven King','Steven','S.'),replace('Steven King','Steven','') -- 제거후 아무것도 넣고싶지 않으면 '' 으로 두면 된다. 
from dual;

-- 숫자 함수

-- abs() : 절대값을 구하는 함수.
select -10, abs(-10)
from dual;

-- floor() : 정수 표현 함수, 소수점 이하는 자르고 앞에있는 정수만 출력.
select 2.1, 2.9, floor(2.9)
from dual;

-- round (원본 , 출력하려는 소수점 자릿수) : 특정 자릿수에서 반올림한다. | 양수 : 오른쪽, 음수 : 왼쪽
select 1234.567, round(1234.567, 1), -- 입력한 출력소수점의 두의값은 반올림하여 올라온다. 결과값 : 1234.6 
round(1234.567, -1), -- -1의 경우 왼쪽에 있는 4가 반올림 처리 된다.
round(1234.567) -- 아무것도 입력하지 않으면 소수점 첫째자리를 반올림하고 소수점이하의 수는 전부 다 없애여 정수만 출력한다.
from dual;

-- truncate ( trunc <- 오라클함수) : 특정 자릿수에서 잘라낸다. (버림)
select 1234.567, truncate(1234.367 ,1), 
truncate(1236.667, -1), -- 특정자릿 수 부터 0이 되어버린다. 
truncate(1236.667,0) -- 뒤에 0을 넣으면 소수점이하의 숫자는 전부 다 버린다. | Oracle 에서 사용되는 trunc() 에 특정자릿수를 아무것도 적지않은것 과 같다. = trunc(123.999) = 123
from dual;

-- mod() : 입력 받은 수를 나눈 나머지 값을 반환한다
select mod(1,3), mod(2,3), mod(3,3), mod(0,3), mod(3,0)
from dual;


-- 날짜 함수 
-- 현재날짜 오라클함수 : sysdate
select sysdate()
from dual;

select months_between(sysdate,'21/12/13')from dual; 
select add_months(sysdate, -6)from dual;
select next_day(sysdate, 6 )from dual;
select last_day(sysdate())from dual;
select round(sysdate()) from dual;
select trunc(sysdate()) from dual;



-- 변환 함수

-- to char(원본, 'format')  2022. 10. 13 14:39
select sysdate,to_char(sysdate, 'YYYY-MM-DD') , to_char(sysdate, 'YYYY.MM.DD') , to_char(sysdate,'YYYY.MM.DD. HH24:MI:sss')
from dual;

-- number -> varchar2

-- select to_char(123456789,'000,000,000,000')  
-- 			,to_char(123456789,'999,999,900')  
-- 			 ,to_char(123456789,'L999,999,900')  
-- from dual;

select str_to_date(123456789,'000,000,000,000')  
			,str_to_date(123456789,'999,999,900')  
			 ,str_to_date(123456789,'L999,999,900')  
from dual;


select ename, sal, to_char(sal*1400, '999,999,999,999') as wonSal
from emp;

-- varchar => date
-- to_date(문자열,'날짜형식')
-- 1992-12-13

select '1911-12-13', to_date('1999-12-13','YYYY-MM-DD') -- select to_date('19911213', 'YYYYMMDD')
from dual;

insert into emp values(9998,'KKK','CLERK', 7782, '1982-12-12', 1300, null, 19);
select * from emp;

rollback;

-- varchar2 => number
select
	to_number('20,000','999,999') - to_number('10,000','999,999')
from dual;

-- dcode 함수 => 여러가지 비교를 통해 결과 출력 switch-case 유사
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
    
