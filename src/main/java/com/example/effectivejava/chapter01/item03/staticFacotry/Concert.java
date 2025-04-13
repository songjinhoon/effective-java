package com.example.effectivejava.chapter01.item03.staticFacotry;

import java.util.function.Supplier;

public class Concert {

    // 정적 팩터리의 메서드 참조를 공급자로 만들 수 있음
    public void start(Supplier<Singer> supplier) {
        Singer singer = supplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(SingerElvis::getInstance);
    }

}
