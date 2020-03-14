package com.lwy.covid.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  21:25
 * @description:
 */

@Data
public class R{
//    OK("ok",200),NOT_FOND("Not Found",404),INTERNAL_SERVER_ERROR("Interal server error",500);

    private String msg;

    private Integer code;

}