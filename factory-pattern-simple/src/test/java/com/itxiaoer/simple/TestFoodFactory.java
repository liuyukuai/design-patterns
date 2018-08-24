package com.itxiaoer.simple;

import org.junit.Test;

public class TestFoodFactory {

    @Test
    public void create() {
        // 顾客想吃土豆丝
        FoodFactory.create("土豆丝").name();
        // 顾客想吃红烧肉
        FoodFactory.create("红烧肉").name();
    }
}
