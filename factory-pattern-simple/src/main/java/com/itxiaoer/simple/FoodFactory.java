package com.itxiaoer.simple;

/**
 * 食物工程类
 *
 * @author : liuyk
 */
public class FoodFactory {

    public static Food create(String type) {
        switch (type) {
            case "土豆丝":
                return new PotatoSilk();
            case "红烧肉":
                return new RedCookedPork();
            default:
                throw new IllegalArgumentException(" type error");
        }
    }
}
