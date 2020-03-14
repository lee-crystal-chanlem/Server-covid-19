package com.lwy.covid.controller;

import com.lwy.covid.entity.Country;
import com.lwy.covid.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  21:39
 * @description:
 */
@RestController
@RequestMapping("/error")
public class ErrorPageController {

    @GetMapping("/404")
    public R notFound(){
        R r = new R();
        r.setCode(404);
        r.setMsg("Not Found");
        return r;
    }

    @GetMapping("/500")
    public R ISR(){
        R r = new R();
        r.setCode(500);
        r.setMsg("Internal Server Error");
        return r;
    }
}
