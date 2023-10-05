package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.User;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserPersistence {

    public List<User> userList() throws Exception;
    public User getUser(String id) throws Exception;
    public int userCount() throws Exception;
    public void userInsert(User dto) throws Exception;
    public void userUpdate(User mdto) throws Exception;
    public void userDelete(String id) throws Exception;
    public User signIn(User mdto) throws Exception;
    public User loginCheck(User mdto) throws Exception;
    public boolean login(HttpServletResponse request) throws Exception;
}



