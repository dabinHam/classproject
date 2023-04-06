-- 20221018

-- inline view - rownum
-- from 절 뒤에 오는 서브쿼리 -> inline view 
-- select -> 결과도 테이블 

select * from emp;

select rownum, emp.* from emp order by hiredate;

-- rownum : 사용자가 생성하는 컬럼이 아니다!, 시스템에서 제공하는 컬럼  => oracle 에서만 사용 가능하다. 

select rownum, t.*
from (select * from emp order by hiredate)t ;

-- top 3
-- 입사일이 가장 오래된 3명을 구하자 ! 

select rownum, t.*
from (select * from emp order by hiredate) t
where rownum <= 3 ;

-- -------------------------------------------------------------------------------

-- DDL : 정의어 => 객체를 정의하는 명령어

-- 데이터의 저장 공간 생성 
-- create table 테이블이름 ( 
--     컬럼이름 타입 [제약조건], 
--     컬럼이름 타입 [제약조건], 
--     ...
-- );

-- 테이블 생성과 제약 조건 
drop table emp01;  -- 테이블 객체를 삭제해 주는 명령어

create table emp01 (
	empno int(4) constraint emp01_empno_pk p,
    ename char(10) constraint emp01_ename_NN not null,
    job varchar2(9) constraint emp01_job_UK unique,
    sal number(7,2) constraint emp01_sal_CK check (sal between 500 and 5000), -- 500~ 5000
    gender char(1) constraint emp01_gender_CK check (gender in('M','F')), -- 남자 M 여자 F
    deptno number(2) constraint emp01_deptno_FK REFFRENCES DEPT(deptno),
    hiredate date default sysdate
);

insert into emp01 (empno, ename, sal, job,gender, deptno)
			values (1111, 'King', 5000, '대표', 'M', 10);
            
insert into emp01 (empno, ename, sal, job,gender, deptno)
			values (1112, 'King', 1500, '대리', 'F', 30);
            
select * from dept;
select * from emp01;


drop table emp02;

-- mysql 에서 constraint 는 아래에 입력해주자.
create table emp02 (
	empno int ,
    ename VARCHAR(10) not null,
    job VARCHAR(9) ,
    sal int, -- 500~ 5000
    gender CHAR(1) , -- 남자 M 여자 F
    deptno int ,
    hiredate timestamp default now(), 	-- sysdate 대신에 now() , sysdate 를 사용하려면 뒤에 함수를 적어줘야함. |  date 대신에 timestamp 사용
    constraint emp02_empno_pk primary key (empno),
    constraint emp02_job_uk unique (job),
    constraint emp02_sal_ck check (sal between 500 and 5000),
    constraint emp02_gender_ck check  (gender in('M','F')),
    constraint emp02_deptno_fk foreign key(deptno) references dept(deptno)
    
);

insert into emp02 (empno, ename, sal, job,gender, deptno)
			values (1111, 'King', 5000, '대표', 'M', 10);
insert into emp02 (empno, ename, sal, job,gender, deptno)
			values (1111, 'King', 5000, '대표', 'M', 10);
select * from emp02;
desc emp02;
insert into emp02 values (1112, 'SON','대리', 500, 'M', 40, '2022-10-17');

-- 지정 입력되지 않은 컬럼에는 null 값이 등록 :  암묵적(명시적으로 하지 않음)으로 null 을 입력하는 방법
insert into emp02 (empno, ename) values(1113,'SCOTT');
insert into emp02 values (1114, 'HOT', null, null, null, null, null); -- 명시적인 방법 
insert into emp02 values (1114, 'HOT', '', '', '', '', ''); -- null 을 입력하는 또 다른방법 많이 쓰이진 않는다. 


-- ---------------------------------
-- 데이터의 수정
-- update 테이블이름 set 컬럼이름 = 새로운값, 컬러이름=새로운값 where 행 선택 조건

drop table emp03; -- 테이블 삭제
create table emp03 as select * from emp; -- 테이블 생성

select * from emp03;
select * from emp03 where ename='SCOTT';
set sql_safe_updates=0; -- 임시로 safemode -> disable로 권한변경 명령문. (원하는쿼리실행 전 실행)
-- 모든 사원의 부서번호를 30으로 변경 | where절이 없다면 모든 행을 대상으로 , 바꾸려는 대상을 set 뒤쪽으로 
update emp03 set deptno=30;

-- 모든 사원의 급여를 10% 인상 
update emp03 set sal=sal*1.1;

-- 급여가 3000 이상인 사원들의 급여를 10% 인상
update emp03 set sal=sal * 1.1 where sal >= 3000;

-- SCOTT 사원을 20번 부서로 이동, 직급을 MANAGER로 변경(여러개 변경시 ',' 를 사용하면 된다. )
update emp03 set deptno=40, job='MANAGER' where ename='SCOTT';

-- 모든 사원의 입사일을 오늘 날짜로 변경
update emp03 set hiredate = now();

-- 부서번호가 10번인 사원의 부서번호를 30번으로 변경
update emp03 set deptno=30 where deptno=10;

-- 'SMITH'사원을 'SCOTT'사원의 부서로 이동 (서브쿼리사용) 
update emp03 set deptno =(select deptno from emp03 where ename='SCOTT') where ename='SMITH'; -- mysql 에선 작동안됨.

update emp03 set deptno =(select deptno from emp03 where ename='SCOTT') where ename='SMITH'; 


drop table dept01;
create table dept01 as select * from dept;
select *from dept01;

-- 1. 부서 번호가 20번인 부서의 이름과 지역은 RESEARCH와 DALLAS입니다. 
-- 다음은 부서번호가 20인 부서의 부서명과 지역명을 부서 번호가 40번인 부서와 동일하게 변경
update dept01
set(dname, loc) = (select dname, loc from dept where deptno=40)
where deptno = 20
;
select * from dept01;

-- -----------------------------------------------------
-- 테이블의 행을 삭제
-- delete from 테이블 이름 where 행 선택조건

-- DELETE 문으로 부서 테이블의 모든 행을 삭제합시다.
delete from dept01;