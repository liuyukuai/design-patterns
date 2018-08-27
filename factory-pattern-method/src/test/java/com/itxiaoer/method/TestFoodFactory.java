package com.itxiaoer.method;

import org.junit.Test;

public class TestFoodFactory {

    @Test
    public void create() {
        // 顾客想吃土豆丝
        new PotatoSilkFactory().create().name();
        // 顾客想吃红烧肉
        new RedCookedPorkFactory().create().name();
    }
}
