package com.itxiaoer.method;

/**
 * 红烧肉工厂类
 *
 * @author : liuyk
 */
public class RedCookedPorkFactory implements FoodFactory {
    @Override
    public Food create() {
        return new RedCookedPork();
    }
}
