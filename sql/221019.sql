-- 20221019

-- Transaction : 일의 단위 => 여러 DML 들을 묶어둔것
-- commit : 작업의 완료 => 데이터의 물리적 저장
-- rollback : 작업 실패 => 마지막 물리적 저장 상태로 복귀

drop table dept02;

create table dept02
as 
select * from dept;

-- DDL 작업 후 자동 commit이 된다

select * from dept02;

-- 트랜잭션 시작
insert into dept02 values(50, '개발', '서울');
insert into dept02 values(60, '기획', '판교');
update dept02 set loc = '제주' where deptno=60;

rollback; -- Oracle 과 다르게 MySQL의 경우 자동으로 commit이 되기 때문에 현재 이 rollback은 처리되지 않는다. 처리를 원한다면 auto commit 설정하기
commit;


-- ----------------------------------------------------------------------------------------------------------------------
-- 가상테이블 : View
-- 데이터를 제한 할 수 있고, 복잡한 sql을 단순하게 처리할 수 있다.

-- 자주 사용되는 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 출력하기 위한 SELECT문을 하나의 뷰로 정의해 봅시다.
select emptno, ename, deptno from emp where deptno = 30;

drop table emp_view30;
-- View 생성
create or replace view  emp_view30
as
select empno, ename, deptno from emp where deptno = 30;

select * from emp_view30;

select * from emp_view30 where ename = 'JAMES';

drop view emp_view30; -- view 삭제

-- MySQL 은 user_view 하지않고 그냥 보기.. 인라인뷰를 할 필요가없음  더 간단함
select * from emp where hiredate limit 0,5;
-- -----------------------------------------------------------------------------------
-- sequence : 자동 숫자 생성기 
-- MySQL은 sequence가 없음 
create sequence seq_Dept_deptno
start with 10
increment by 10
;

create seqyence seq_emp_empno;
select seq_emp_empno.nextval from dual;

-- 새로운 값을 생성 : nextval -> 다음값을 생성해서 반환
select seq_Dept_deptno.nextval from dual;
select seq_Dept_deptno.currval from dual;

/* sequence 삭제 */
drop sequence seq_Dept_deptno;

drop table dept04;
create table dept04
as
select * from dept where 1=0;
select * from dept04;

insert into dept04 values (seq_Dept_deptno.nextval, '개발','서울'); -- deptno 가 10,20,30 ...70 이런식으로 늘어남

/* MySQL seqyence */
insert into test_table(memo) values('안녕'); -- 실행할수록 점점 늘어남. 
-- --------------------------------------------------------------------------------------
-- index : 검색의 성능을 향상시킬때 사용

drop table emp01;
create table emp01
as
select * from emp;
select * from emp01;

insert into emp01 select * from emp01;
insert into emp01 (empno, ename) values(1111,'SON');

select * from emp01 where ename='SON';

-- index 생성
create index index_emp01_ename on emp01(ename);

-- drop index index_emp01_ename; -- Oracle index 삭제 
ALTER TABLE emp01 DROP INDEX index_emp01_ename; -- mysql index 삭제

select * from emp01 where ename ='SON';

commit;

select * from emp where empno='1111';

select * from dept;
desc dept;
commit;

insert into dept values (50,'개발','서울'); -- 행 추가
update dept set dname='기획' , loc='제주' where deptno=50; -- 행 수정
delete from dept where deptno=50; -- 행 삭제
