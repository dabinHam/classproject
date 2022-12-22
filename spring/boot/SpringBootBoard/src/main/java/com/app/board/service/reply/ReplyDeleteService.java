package com.app.board.service.reply;


import com.app.board.mapper.ReplyMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyDeleteService {

    @Autowired
    private ReplyMapper replyMapper;

    public int deleteByRno(int rno){
        return replyMapper.deleteByRno(rno);
    }


}