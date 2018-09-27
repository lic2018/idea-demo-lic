package com.lic.demo.config;

import com.lic.demo.code.LoginFilter;
import com.lic.demo.code.RoleFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lic
 * @data: 2018/9/27
 */
//@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public FilterRegistrationBean<Filter> getDemoFilter() {

        LoginFilter loginFilter = new LoginFilter();
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>();
        filterRegistrationBean.setFilter(loginFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        filterRegistrationBean.setOrder(3);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> getRoleFilter() {

        RoleFilter roleFilter = new RoleFilter();
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>();
        filterRegistrationBean.setFilter(roleFilter);

        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }





}
