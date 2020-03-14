package com.lwy.covid.service;

import com.lwy.covid.entity.Country;

import java.util.Date;
import java.util.List;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  14:04
 * @description:
 */

public interface CountryService {

    List<Country> getAllByName(String name);

    List<Country> getAllById(Integer id);

    List<Country> getAllByTime(Date date);

    void insertCountry(Country country);

}
