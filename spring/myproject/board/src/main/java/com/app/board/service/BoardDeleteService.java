package com.app.board.service;


import com.app.board.domain.BoardDTO;
import com.app.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDeleteService {

    @Autowired
    private BoardMapper boardMapper;

    public int delete(int bno){

        int result = boardMapper.deleteByBno(bno);

        if(result>0){
            
        }

        return result;
    }


}
