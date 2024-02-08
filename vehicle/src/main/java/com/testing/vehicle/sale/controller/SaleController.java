package com.testing.vehicle.sale.controller;

import com.testing.vehicle.sale.service.SaleService;
import com.testing.vehicle.sale.service.SaleServiceImpl;
import com.testing.vehicle.sale.vo.CarInfoVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SaleController {

    @Resource(name="saleService")
    private SaleServiceImpl saleService;

    //홈
    @GetMapping("/home")
    public String home(){
        return "content/home_content";
    }

    //차량관리 페이지 이동
    @GetMapping("/manage")
    public String manage(){
        return "content/manage_content";
    }

    //차량관리 페이지 (등록)
    @PostMapping("/insertCar")
    public void insertCar(CarInfoVO carInfoVO){
        saleService.insertCar(carInfoVO);
    }

    //차량정보등록
    @GetMapping("/sales")
    public String sales(){
        return "content/sales_content";
    }

    //차량목록
    @GetMapping("/carList")
    public String carList(){
        return "content/carList_content";
    }


}
