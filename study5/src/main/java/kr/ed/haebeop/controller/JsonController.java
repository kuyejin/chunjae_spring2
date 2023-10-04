package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/json/")
public class JsonController {

    @Autowired
    private TestService testService3;

    //GET
    @GetMapping("getTest/{num}")
    @ResponseBody
    public TestVO viewTest(@PathVariable int num) throws Exception{
        TestVO test = testService3.getTest(num);
        return test;
    }

    //POST
    @PostMapping("insertForm")
    @ResponseBody
    public TestVO insertPro(@RequestBody TestVO test) throws Exception{
        TestVO t = test;
        testService3.testInsert(test);
        return t;
    }


    @GetMapping("insertForm2")
    public String insertForm2(Model model) throws Exception{
        return "/test/testInsert2";
    }

    //POST
    @PostMapping("insertForm2")
    @ResponseBody //@RequestBody - json 객체로 값 받아오기
    public TestVO insertPro2(@RequestBody TestVO test) throws Exception{
        testService3.testInsert(test);
        return test;
    }


}
