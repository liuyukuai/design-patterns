package com.itxiaoer.method;

/**
 * 土豆丝工厂类
 *
 * @author : liuyk
 */
public class PotatoSilkFactory implements FoodFactory {
    @Override
    public Food create() {
        return new PotatoSilk();
    }
}
