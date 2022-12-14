package com.app.board.service;


import com.app.board.domain.BoardDTO;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BoardViewService {

    @Autowired
    private BoardMapper boardMapper;

    public BoardDTO selectBoardDTO(int bno){
        return boardMapper.selectByBno(bno);
    }
}
