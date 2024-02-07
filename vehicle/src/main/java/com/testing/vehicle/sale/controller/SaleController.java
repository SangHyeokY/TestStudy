package com.testing.vehicle.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SaleController {

    //홈
    @GetMapping("/home")
    public String home(){
        return "content/home_content";
    }

    //차량관리
    @GetMapping("/manage")
    public String manage(){
        return "content/manage_content";
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
