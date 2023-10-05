package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.User;
import kr.ed.haebeop.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/user/")
public class UserController {

    private static final Logger logger =  LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Inject
    BCryptPasswordEncoder pwdEncoder;

    @Autowired
    HttpSession session;

    /*=====================[로그인]=========================*/
    /*로그인 폼 이동*/
    @GetMapping("login.do")
    public String userLoginForm(Model model) throws Exception {
        return "/user/loginForm";
    }


    //회원 목록보기
    @RequestMapping(value = "List" , method = RequestMethod.GET)
    public String userList(Model model) throws Exception{
        List<User> userList = userService.userList();
        model.addAttribute("userList",userList);
        return "/admin/userList";
    }







}
