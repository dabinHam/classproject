package com.firstcoding.mvc.springmvc;
// 처음 시작하는 페이지

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     // 어노테이션등록 필수!
@Log4j2        // 사용하려면 src/main/resources 에 log4j2.xml파일을 넣어줘야 한다!
public class IndexController {

    @RequestMapping("/index")  // 요청 매핑 - 사용자가 요청했을때 이 메소드를 어떻게 실행할것인지

    public void getIndex(){     // void 는 이름이 없다
        log.info("Index page ...");
    }

}
