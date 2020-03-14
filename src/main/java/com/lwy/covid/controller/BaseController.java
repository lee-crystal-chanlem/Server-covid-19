package com.lwy.covid.controller;

import com.lwy.covid.entity.Country;
import com.lwy.covid.entity.R;
import com.lwy.covid.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    CountryService countryService;

    /**
     * 根据国家名字查询记录
     */
    @GetMapping("/country/{name}")
    public List<Country> getByName(@PathVariable("name") String name, HttpServletResponse response) throws IOException {
        if(name.isEmpty()){
            return null;
        }
        List<Country> all = countryService.getAllByName(name);
        return all;
    }
}
