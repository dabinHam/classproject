package com.app.board.service;


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

    public List<BoardDTO> getList(int pageNum){
        int index = (pageNum-1)*10;
        int count = 10;

        return boardMapper.selectList(index,count);
    }

    public BoardListPage getPage(int pageNum){

        // 게시물의 리스트
        List<BoardDTO> list = boardMapper.selectList((pageNum-1)*10,10);

        // 전체 게시물의 개수
        int totalCount = boardMapper.totalCount();

        BoardListPage boardListPage = new BoardListPage(10,pageNum,list,totalCount);

        return boardListPage;
    }

}
