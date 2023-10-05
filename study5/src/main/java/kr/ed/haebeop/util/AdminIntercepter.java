package kr.ed.haebeop.util;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminIntercepter extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
        /*자동로그인 안되게 막아줌*/
        HttpSession session = request.getSession(false);

        String sid = (String) session.getAttribute("sid");
        
        /*로그인 안했단 것*/
        if(session.getAttribute("sid") == null){
            response.sendRedirect(request.getContextPath()+"/user/loginForm");
            return false;
        }
        
        /*admin으로 로그인을 했을 경우 */
       if(sid.equals("admin")){
           return true;
       }else { 
           response.sendRedirect(request.getContextPath()+"/user/loginForm");
            return false;
       }
        
     
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
