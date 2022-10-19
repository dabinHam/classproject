-- 20221018
-- MySQL 
-- Oracle의 rownum 은 MySQL 에서 쓰이지 않는다. 대신 limit 이 사용된다 .
-- limit
select * from emp order by hiredate limit 0,3; -- 순위