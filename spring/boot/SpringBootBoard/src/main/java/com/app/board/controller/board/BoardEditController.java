package com.app.board.controller.board;


import com.app.board.domain.BoardEditRequest;
import com.app.board.service.board.BoardEditService;
import com.app.board.service.board.BoardViewService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
@RequestMapping("/board/edit")
public class BoardEditController {

    @Autowired
    private BoardViewService boardViewService;

    @Autowired
    private BoardEditService boardEditService;

    @GetMapping
    public void editForm(@RequestParam("bno") int bno, @RequestParam("p")int p, Model model){
        model.addAttribute("board",boardViewService.selectBoardDTO(bno));
        model.addAttribute("currPageNum", p);    // 여기서 p의 값은 post까지 전달한다.
        log.info(boardViewService);
    }

    @PostMapping
    public String edit(BoardEditRequest boardEditRequest, RedirectAttributes redirectAttributes){

        log.info(boardEditRequest);

        redirectAttributes.addAttribute("bno", boardEditRequest.getBno());
        redirectAttributes.addAttribute("p", boardEditRequest.getCurrPageNum());

        boardEditService.edit(boardEditRequest);
        return "redirect:/board/view";
    }
}
