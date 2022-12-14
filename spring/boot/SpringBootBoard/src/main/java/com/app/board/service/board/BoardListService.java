package com.app.board.service.board;

import com.app.board.domain.BoardArticleDTO;
import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardListPage;
import com.app.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    private BoardMapper boardMapper;

    public BoardListPage getPage(int pageNum){

        // 게시물의 리스트
        List<BoardArticleDTO> list = boardMapper.selectList((pageNum-1)*10,10);

        // 전체 게시물의 개수
        int totalCount = boardMapper.totalCount();

        BoardListPage boardListPage = new BoardListPage(10,pageNum,list,totalCount);

        return boardListPage;
    }

    public List<BoardArticleDTO> getList(int pageNum){ // 페이지번호(pageNum)에 따라서 인덱스가 변하는 거라서 받아와야함.

        int index = (pageNum-1)*10;     // 1->0, 2->10, 3->20, 4->30
        int count = 10;

        return boardMapper.selectList(index,count);

    }

}
