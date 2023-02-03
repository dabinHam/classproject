-- MySQL 
-- 오라클의 경우 마지막에 커밋을 꼭 해줘야 저장된다. 
CREATE TABLE salgrade (
grade int,
losal int,
hisal int
);
INSERT INTO salgrade VALUES (1, 700, 1200);
INSERT INTO salgrade VALUES (2, 1201, 1400);
INSERT INTO salgrade VALUES (3, 1401, 2000);
INSERT INTO salgrade VALUES (4, 2001, 3000);
INSERT INTO salgrade VALUES (5, 3001, 9999);
COMMIT;

select ename, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;