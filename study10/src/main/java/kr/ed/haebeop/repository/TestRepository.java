package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Test;

import java.util.List;


public interface TestRepository {
    public List<Test> testList() throws Exception;
    public Test getTest(int num) throws Exception;
    public void testInsert(Test test) throws Exception;
}
