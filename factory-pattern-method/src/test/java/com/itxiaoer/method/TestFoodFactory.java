package com.itxiaoer.method;

import org.junit.Test;

public class TestFoodFactory {

    @Test
    public void create() {
        new PotatoSilkFactory().create().name();
        new RedCookedPorkFactory().create().name();
    }
}
