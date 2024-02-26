package com.testing.vehicle.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestVO {
    private int messageCode;
    private String messageContent;
    private String messageDate;

    private int memberCode;
    private int seatNum;
}
