package com.testing.vehicle.test;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //메세지 저장
    @Override
    public void insertMessage(TestVO testVO) {
        sqlSession.insert("vehicleMapper.insertMessage", testVO);
    }
}
