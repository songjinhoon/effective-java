package com.example.effectivejava.chapter01.item03;

import org.junit.jupiter.api.Test;

class ConcertTest {

    @Test
    void test() {
        /* Concert 테스트하기위해 Elvis 가와서 구현되어있는 sing 을 호출함 */
        Concert concert = new Concert(Elvis.INSTANCE);
        concert.perform();

        /* 인터페이스를 구현해서 만든 싱글턴이면 mock 구현으로 대체 가능  */
        Concert concertB = new Concert(new MockElvis());
        concertB.perform();

    }

}