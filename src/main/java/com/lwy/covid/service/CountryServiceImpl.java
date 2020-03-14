package com.lwy.covid.service;

import com.lwy.covid.entity.Country;
import com.lwy.covid.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  18:45
 * @description:
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryMapper countryMapper;

    @Override
    public List<Country> getAllByName(String name) {
        return countryMapper.selectAllByCountryName(name);
    }

    @Override
    public List<Country> getAllById(Integer id) {
        return countryMapper.selectAllByCountryId(id);
    }

    @Override
    public List<Country> getAllByTime(Date date) {
        // sdf 线程不安全的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        return countryMapper.selectAllByTime(format);
    }

    @Override
    public void insertCountry(Country country) {
        countryMapper.add(country);
    }
}
