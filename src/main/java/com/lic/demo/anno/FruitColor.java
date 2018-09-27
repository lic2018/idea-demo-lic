package com.lic.demo.anno;

import java.lang.annotation.*;

/**
 * @Author: lic
 * @data: 2018/9/27
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /*
     * 颜色枚举
     * @author lic
     * @data 2018/9/27
     * @param
     * @return
     */
    public enum Color {
        BLUE, RED, GREEN
    }


    /*
     * 颜色属性
     * @author lic
     * @data 2018/9/27
     * @param []
     * @return com.lic.demo.anno.FruitColor.Color
     */
    Color fruitColor() default Color.GREEN;
}
