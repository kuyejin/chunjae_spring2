package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.User;
import kr.ed.haebeop.repository.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{


    BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserPersistence userPersistence;


    @Override
    public List<User> userList() throws Exception {
        return userPersistence.userList();
    }

    @Override
    public User getUser(String id) throws Exception {
        return userPersistence.getUser(id);
    }

    @Override
    public int userCount() throws Exception {
        return userPersistence.userCount();
    }

    @Override
    public void userInsert(User dto) throws Exception {
        userPersistence.userInsert(dto);
    }

    @Override
    public void userUpdate(User mdto) throws Exception {
        userPersistence.userUpdate(mdto);
    }

    @Override
    public void userDelete(String id) throws Exception {
        userPersistence.userDelete(id);
    }

    @Override
    public User signIn(User mdto) throws Exception {
        return userPersistence.signIn(mdto);
    }

 @Override
   public User loginCheck(User mdto) throws Exception {
      boolean comp = false;
        User user = userPersistence.loginCheck(mdto);
        boolean loginSuccess = pwEncoder.matches(mdto.getPw(), user.getPw());
        if(user!=null && loginSuccess){
            comp = true;
        } else {
            comp = false;
        }
        return mdto;
    }

    @Override
    public boolean login(HttpServletResponse request) throws Exception {
        return userPersistence.login(request);
    }
}
