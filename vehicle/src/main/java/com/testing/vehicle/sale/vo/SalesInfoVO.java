package com.testing.vehicle.sale.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class SalesInfoVO {
    private int salesNumber;
    private String customerName;
    private String customerTel;
    private String carColor;
    private int modelNumber;
    private String salesDate;

    //이거 왜 안됨
    private CarInfoVO carInfoVO;

}
