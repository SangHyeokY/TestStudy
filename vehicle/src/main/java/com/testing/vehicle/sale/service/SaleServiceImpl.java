package com.testing.vehicle.sale.service;

import com.testing.vehicle.sale.vo.CarInfoVO;
import com.testing.vehicle.sale.vo.SalesInfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("saleService")
public class SaleServiceImpl implements SaleService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //차량 등록
    @Override
    public void insertCar(CarInfoVO carInfoVO) {
        sqlSession.insert("vehicleMapper.insertCar", carInfoVO);
    }

    //차량 등록 / 리스트 표시
    @Override
    public List<CarInfoVO> selectCarList() {
        return sqlSession.selectList("vehicleMapper.selectCarList");
    }

    //판매정보 등록
    @Override
    public void insertSales(SalesInfoVO salesInfoVO) {
        sqlSession.insert("vehicleMapper.insertSales", salesInfoVO);
    }

    //판매목록 표시
    @Override
    public List<SalesInfoVO> selectAllInfo() {
        return sqlSession.selectList("vehicleMapper.selectAllInfo");
    }
}
