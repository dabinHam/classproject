package com.app.board.controller.board;

import com.app.board.domain.BoardWriteRequest;
import com.app.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Controller
@Log4j2
@RequestMapping("/board/write")
public class BoardWriteController {

    @Autowired
    private BoardWriteService boardWriteService;

    @GetMapping
    public void writeForm(){

    }

    @PostMapping
    public String write(BoardWriteRequest boardWriteRequest){

        log.info(">>>>>>>>>>>>>>>>>>"+boardWriteRequest);
        String absolutePath = new File("").getAbsolutePath();   // 저장공간이 존재하지 않으면 생성해주고 저장해주는걸 만들꺼!
        log.info(">>> path : " + absolutePath);

        boardWriteService.write(boardWriteRequest);

        return "redirect:/board/list";
    }
}
