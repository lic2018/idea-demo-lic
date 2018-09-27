package com.lic.demo.code;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户登录过滤器
 */
public class LoginFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        // 去除不用过滤的菜单
        String[] excludeUrl = {"/user/login", "/user/logout"};
        String requestURI = httpServletRequest.getRequestURI();
        System.out.println("请求地址：" + requestURI);

        for (String url: excludeUrl) {
            if (url.equals(requestURI)) {
                filterChain.doFilter(httpServletRequest, httpServletResponse);
                return;
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
//        if (user != null) {
//            filterChain.doFilter(httpServletRequest, httpServletResponse);
//            return;
//        } else {
//            return;
//        }


    }
}
