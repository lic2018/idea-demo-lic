package com.lic.demo.anno;

import java.lang.annotation.*;

/* 自定义注解
 * @Author: lic
 * @data: 2018/9/27
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
