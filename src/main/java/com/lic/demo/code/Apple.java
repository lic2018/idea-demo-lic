package com.lic.demo.code;

import com.lic.demo.anno.FruitColor;
import com.lic.demo.anno.FruitName;
import com.lic.demo.anno.FruitProvider;

/**
 * @Author: lic
 * @data: 2018/9/27
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

//    @FruitProvider(id = 1, name = "红富士", address = "杭州")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }


}
