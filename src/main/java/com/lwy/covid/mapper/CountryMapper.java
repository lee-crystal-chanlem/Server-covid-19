package com.lwy.covid.mapper;

import com.lwy.covid.entity.Country;
import java.util.Date;
import java.util.List;


public interface CountryMapper {

    /**
     * 根据ID找相应国家所有数据
     * @param id
     * @return
     */
    List<Country> selectAllByCountryId(Integer id);

    /**
     * 根据Name找相应国家所有数据
     * @param name
     * @return
     */
    List<Country> selectAllByCountryName(String name);

    /**
     * 根据日期找对应日期所有国家数据
     * @param time
     * @return
     */
    List<Country> selectAllByTime(String time);

    void add(Country country);

}
