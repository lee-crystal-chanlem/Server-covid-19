package com.lwy.covid.controller;

import com.lwy.covid.entity.Country;
import com.lwy.covid.entity.R;
import com.lwy.covid.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  20:57
 * @description:
 * 最基本的处理器
 * 前后端分离  返回JSON
 */
@RestController
@RequestMapping("/api")
public class BaseController {
//
//    String regx = "\\d\\d\\d\\d-\\d\\d-\\d\\d";
//    Pattern p = Pattern.compile(regx);


    @Autowired
    CountryService countryService;

    /**
     * 根据国家名字查询记录
     */
    @GetMapping("/country/{name}")
    public List<Country> getByName(@PathVariable("name") String name) throws IOException {
        List<Country> all = countryService.getAllByName(name);
        return all;
    }
    /**
     * 根据时间来查询所有国家的数据
     */
    @GetMapping("/time/{time}")
    public List<Country> getByTime(@PathVariable("time") String time,HttpServletResponse response) throws IOException {
        List<Country> all = countryService.getAllByTime(time);
        return all;
    }

    @PostMapping("/country/add")
    public R addCountry(@Valid@RequestBody Country country, BindingResult bindingResult){
        R r = new R();
        if(bindingResult.hasErrors()){
            r.setMsg("post数据错误");
            r.setCode(-1);
            return r;
        }
        //
        countryService.insertCountry(country);
        r.setCode(200);
        r.setMsg("success");
        return r;
    }
}
