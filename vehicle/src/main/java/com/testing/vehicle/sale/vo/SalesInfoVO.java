package com.testing.vehicle.sale.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesInfoVO {
    private int salesNumber;
    private String customerName;
    private String customerTel;
    private String carColor;
    private int modelNumber;
}
