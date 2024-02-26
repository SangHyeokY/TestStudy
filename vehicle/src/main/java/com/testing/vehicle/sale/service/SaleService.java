package com.testing.vehicle.sale.service;

import com.testing.vehicle.sale.vo.CarInfoVO;
import com.testing.vehicle.sale.vo.SalesInfoVO;
import com.testing.vehicle.test.TestVO;

import java.util.List;

public interface SaleService {

    //차량 등록
    void insertCar(CarInfoVO carInfoVO);

    //차량등록 / 리스트 표시
    List<CarInfoVO> selectCarList();

    //판매정보등록 / 모델명 넣기는 아직 못함
    void insertSales(SalesInfoVO salesInfoVO);

    //판매목록 표시
    List<SalesInfoVO> selectAllInfo();

}
