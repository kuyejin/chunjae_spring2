package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Test;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TestMapperImpl implements TestMapper {

    @Autowired
    private SqlSession sqlSession;


    @Override
    public List<Test> getTestList() throws Exception {
        return sqlSession.selectList("test.getTestList");
    }
}

