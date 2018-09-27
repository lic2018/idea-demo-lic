package com.lic.demo.anno;

import java.lang.annotation.*;

/**
 * @Author: lic
 * @data: 2018/9/27
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authorized {
//    String hasRole() default "";
}
