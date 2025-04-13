package com.example.effectivejava.chapter01.item03.staticFacotry;

public class SingerElvis implements Singer {

    private static final SingerElvis elvis = new SingerElvis();

    private SingerElvis() {}

    public static SingerElvis getInstance() {
        return elvis;
    }

    @Override
    public void sing() {
        System.out.println("Elvis");
    }

}
