package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ajax/")
public class AjaxController {
    @GetMapping("/")
    public String ajaxHome() {
        return "/ajax/home";
    }

    @GetMapping("/test1")
    public String ajaxTest1() {
        return "/ajax/test1";
    }

    @GetMapping("/test1pro")
    public String ajaxTest1Pro() {
        System.out.println("GET 전송 테스트");
        return "/ajax/test1";
    }

    @PostMapping("/test2")
    public String ajaxTest2() {
        return "/ajax/test2";
    }

    @PostMapping("/test2pro")
    public String ajaxTest2Pro() {
        System.out.println("POST 전송 테스트");
        return "/ajax/test2";
    }


}
