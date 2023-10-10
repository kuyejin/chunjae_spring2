package kr.ed.haebeop.test;

import kr.ed.haebeop.domain.Test;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ServiceTest1 {

    @Autowired
    private static TestService testService;

    public static void main(String[] args) throws Exception{
        testList();
    }

    public static void testList() throws Exception {
        List<Test> testList = testService.testList();
        for(Test test : testList){
            System.out.println(test.toString());
        }
    }
}
