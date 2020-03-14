package com.lwy.covid.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;


import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  13:45
 * @description:
 * 描述一个国家某一天新冠肺炎的情况
 */
@Data
@ToString
public class Country {

    private Integer countryId;

    private String countryName;

    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    private Integer confirmNum;

    private Integer deadNum;

    private Integer healNum;
}
