package kr.ed.haebeop.util;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserIntercepter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        /*자동로그인 안되게 막아줌*/
        HttpSession session = request.getSession(false);

        /*로그인 했다는 것*/
        if(session.getAttribute("user")!=null && session !=null){
            flag=true;
            System.out.println("** 인터셉터 통과 : 요청 주소 **" + request.getRequestURI());
        }else {
            flag = false;
            System.out.println("** 인터셉터 실패 : 접근 실패 **");
            response.sendRedirect("/");
        }
        return flag;
    }



}
