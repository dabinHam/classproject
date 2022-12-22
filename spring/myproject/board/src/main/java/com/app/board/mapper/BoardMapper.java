package com.app.board.mapper;

import com.app.board.domain.BoardDTO;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface BoardMapper {

    // 전체리스트 출력
    @Select("select * from tbl_board2")
    List<BoardDTO> selectAll();


    // 리스트 한페이지 출력
    @Select("select * from tbl_board2 order by bno desc limit #{start},#{count}")
    List<BoardDTO> selectList(@Param("start") int start, @Param("count")int count);

/*    @Select("select * , (select count(*) from tbl_reply r where r.bno=b.bno)as replycnt from tbl_board b order by b.bno desc limit #{start},#{count}")
    List<BoardArticleDTO> selectList(@Param("start") int start, @Param("count")int count);*/

    // 전체 게시물의 개수 구하기
    @Select("select count(*) from tbl_board2")
    Integer totalCount();

    // 게시글 하나의 정보 읽기
    @Select("select * from tbl_board2 where bno=#{no}")
    BoardDTO selectByBno(int bno);

    // 게시글 입력
    @Insert("insert into tbl_board2 (title,content,writer,photo)VALUES(#{title},#{content},#{writer},#{photo})")
    Integer insert(BoardDTO boardDTO) throws SQLException;

    // 게시글 삭제
    @Delete("delete from tbl_board2 where bno=#{bno}") // parameter가 하나밖에 없기때문에 이름을 뭘로 적어도 상관없다.
    Integer deleteByBno(int bno);

    // 게시글 수정
    @Update("update tbl_board2 set title=#{title}, content=#{content}, writer=#{writer}, photo=#{photo}, updatedate=now() where bno=#{bno}") // sql문은 대소문자 상관없음.
    Integer update(BoardDTO boardDTO) throws SQLException;
}
