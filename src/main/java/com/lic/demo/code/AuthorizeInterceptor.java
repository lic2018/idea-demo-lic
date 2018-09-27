package com.lic.demo.code;

import com.lic.demo.anno.Authorized;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: lic
 * @data: 2018/9/27
 */
public class AuthorizeInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod hdlm = (HandlerMethod) handler;

        System.out.println(hdlm.getMethod());
        System.out.println(hdlm.hasMethodAnnotation(Authorized.class));
        if (!hdlm.hasMethodAnnotation(Authorized.class)) {
            return true;
        }

        String json = "name:123";
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getWriter().write(json);
        return false;
    }
}
