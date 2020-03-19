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
    private Integer ID;

    private String countryName;

    // 为了格式化Object的时候的输出
    @JSONField(format="yyyy-MM-dd")
    //@DateTimeFormat(pattern = "yyyy-MM-dd") 本来目标是Country作为前面RequestBody来解析的 但是好像没有必要
    private Date time;

    private Integer confirmNum;

    private Integer deadNum;

    private Integer healNum;
}
