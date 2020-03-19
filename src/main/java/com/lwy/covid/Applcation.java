package com.lwy.covid;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.lwy.covid.config.CrosFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  11:15
 * @description:
 */
@SpringBootApplication
@MapperScan("com.lwy.covid.mapper")
public class Applcation extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(Applcation.class,args);
    }

    // fastJson 支持
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter convert = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        convert.setFastJsonConfig(config);
        converters.add(convert);
    }

    /**
     * 配置跨域访问的过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean registerFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrosFilter());
        return bean;
    }
}
