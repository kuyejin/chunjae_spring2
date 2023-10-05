package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Repository
public class UserPersistenceImpl implements UserPersistence{

    @Autowired
    private SqlSession sqlSession;


    @Override
    public List<User> userList() throws Exception {
        return sqlSession.selectList("user.userList");
    }

    @Override
    public User getUser(String id) throws Exception {
        return sqlSession.selectOne("user.getUser", id);
    }

    @Override
    public int userCount() throws Exception {
        return sqlSession.selectOne("user.userCount");
    }

    @Override
    public void userInsert(User dto) throws Exception {
        sqlSession.insert("user.userInsert", dto);
    }

    @Override
    public void userUpdate(User mdto) throws Exception {
        sqlSession.update("user.userUpdate", mdto);
    }

    @Override
    public void userDelete(String id) throws Exception {
        sqlSession.delete("user.userDelete", id);
    }

    @Override
    public User signIn(User mdto) throws Exception {
        return sqlSession.selectOne("user.signIn", mdto);
    }

    @Override
    public User loginCheck(User mdto) throws Exception {
        return sqlSession.selectOne("user.loginCheck", mdto);
    }

    @Override
    public boolean login(HttpServletResponse request) throws Exception {
        return sqlSession.selectOne("user.login", request);
    }
}



