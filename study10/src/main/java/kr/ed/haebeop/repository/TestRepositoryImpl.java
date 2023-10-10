package kr.ed.haebeop.repository;
import kr.ed.haebeop.domain.Test;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Test> testList() throws Exception {
        return sqlSession.selectList("test.testList");
    }

    @Override
    public Test getTest(int num) throws Exception {
        return sqlSession.selectOne("test.getTest", num);
    }

    @Override
    public void testInsert(Test test) throws Exception {
        sqlSession.insert("test.testInsert", test);
    }
}
