package com.testing.vehicle.sale.service;

import com.testing.vehicle.sale.vo.CarInfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("saleService")
public class SaleServiceImpl implements SaleService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //차량 등록
    @Override
    public void insertCar(CarInfoVO carInfoVO) {
        sqlSession.insert("vehicleMapper.insertCar", carInfoVO);
    }
}
