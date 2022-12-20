package com.app.board.controller.board;

import com.app.board.entity.Board;
import com.app.board.mapper.BoardMapper;
import com.app.board.repository.BoardRepository;
import com.app.board.security.CustomUser;
import com.app.board.service.board.BoardViewService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class BoardViewController {

    @Service
    public class BoardViewService {

        @Autowired
        private com.app.board.service.board.BoardViewService boardViewService;

        @GetMapping("/board/view")
        public void readArticle(
                @RequestParam("bno") int bno,
                @RequestParam("p") int p,
                @AuthenticationPrincipal CustomUser customUser,
                Model model

        ) {
            model.addAttribute("currentPageNum", p);
            model.addAttribute("boardView", boardViewService.selectBoardDTO(bno));
            model.addAttribute("loginInfo", customUser.getBoardMember().getIdx());
        }

    }
}