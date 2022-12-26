CREATE TABLE `tbl_board2` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) COLLATE utf8mb3_bin NOT NULL,
  `content` varchar(2000) COLLATE utf8mb3_bin NOT NULL,
  `writer` varchar(50) COLLATE utf8mb3_bin NOT NULL,
  `photo` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  `regdate` date DEFAULT (now()),
  `updatedate` date DEFAULT (now()),
  PRIMARY KEY (`bno`)
);

CREATE TABLE project.`tbl_reply` (
  `rno` int NOT NULL AUTO_INCREMENT,
  `bno` int NOT NULL,
  `reply` varchar(1000) COLLATE utf8mb3_bin NOT NULL,
  `replyer` varchar(50) COLLATE utf8mb3_bin NOT NULL,
  `replyDate` date DEFAULT (now()),
  `updateDate` date DEFAULT (now()),
  PRIMARY KEY (`rno`),
  KEY `fk_reply_board` (`bno`),
  CONSTRAINT `fk_reply_board` FOREIGN KEY (`bno`) REFERENCES `tbl_board` (`bno`)
) ;


CREATE TABLE `boardmember` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(45) COLLATE utf8_bin NOT NULL,
  `password` varchar(60) COLLATE utf8_bin NOT NULL,
  `username` varchar(45) COLLATE utf8_bin NOT NULL,
  `role` varchar(45) COLLATE utf8_bin NOT NULL DEFAULT 'USER',
  `regdate` datetime DEFAULT (now()),
  `editdate` datetime DEFAULT (now()),
  PRIMARY KEY (`idx`),
  UNIQUE KEY `userid_UNIQUE` (`userid`)
);

-- 221219
-- role : text로 USER or ADMIN 으로 경로를 만들어놓고 처리할 예정 

-- 데이터 한번에 지우기 
delete from tbl_board2 where bno>0;
delete from tbl_reply where rno>0;

-- 데이터 입력하기
INSERT INTO `project`.`tbl_board`
(`title`,`content`,`writer`)
VALUES('게시글제목','내용테스트','duobin');

insert into tbl_board2 select * from tbl_board2;

-- 게시물 총 개수 
select count(*) from tbl_board2;

-- 오름차순 정리
select * from tbl_board2 order by bno desc;

-- 한페이지당 출력할 게시물 갯수 정하기 limit
select * from tbl_board2 order by bno desc limit 70,10;	-- 맨 뒷페이지 

-- 게시글 삭제
delete from tbl_board2 where bno=1;

-- 게시글 수정
update tbl_board2 set title='tet', content='tet', writer='tet', photo=null, updatedate=now() where bno=4



