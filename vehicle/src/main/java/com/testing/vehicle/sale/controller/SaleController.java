package com.testing.vehicle.sale.controller;

import com.testing.vehicle.sale.service.SaleService;
import com.testing.vehicle.sale.service.SaleServiceImpl;
import com.testing.vehicle.sale.vo.CarInfoVO;
import com.testing.vehicle.sale.vo.SalesInfoVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class SaleController {

    @Resource(name="saleService")
    private SaleServiceImpl saleService;

    //(1)//////////////////////////////////////////////////////////////////

    //홈 페이지
    @GetMapping("/home")
    public String home(){
        return "content/home_content";
    }

    //(2)//////////////////////////////////////////////////////////////////

    //차량관리 페이지
    @GetMapping("/manage")
    public String manage(Model model){
        //리스트 표시
        List<CarInfoVO> carList = saleService.selectCarList();
        model.addAttribute("carList", carList);
        return "content/manage_content";
    }

    //차량관리 페이지 (등록)
    @PostMapping("/insertCar")
    public String insertCar(CarInfoVO carInfoVO, Model model){
        List<CarInfoVO> carList = saleService.selectCarList();
        model.addAttribute("carList", carList);
        saleService.insertCar(carInfoVO);
        return "redirect:/manage";
    }

    //(3)//////////////////////////////////////////////////////////////////

    //차량 판매정보등록 페이지
    @GetMapping("/sales")
    public String sales(Model model){
        List<CarInfoVO> carList = saleService.selectCarList();
        model.addAttribute("carList", carList);
        return "content/sales_content";
    }

    //차량 판매정보등록 페이지 (등록)
    @PostMapping("/insertSales")
    public String insertSales(SalesInfoVO salesInfoVO){
        saleService.insertSales(salesInfoVO);
        return "redirect:/carList";
    }

    //(4)//////////////////////////////////////////////////////////////////

    //판매목록 페이지
//    @GetMapping("/carList")
//    public String carList(){
//        return "content/carList_content";
//    }

    //판매목록 상품정보리스트 페이지
    @GetMapping("/carList")
    public String selectAllInfo(Model model){
        //join문 덜 들어감
        List<SalesInfoVO> salesList = saleService.selectAllInfo();
        model.addAttribute("salesList", salesList);
        return "content/carList_content";
    }

}
