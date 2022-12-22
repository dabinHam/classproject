package com.app.board.controller.board;


import com.app.board.service.BoardEditService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class BoardEditController {


    @Autowired
    private BoardEditService boardEditService;

    @GetMapping
    public void editForm(){

    }

    @PostMapping
    public String edit(){
        return null;
    }

}
