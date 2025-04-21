package com.example.effectivejava.chapter01.item11.confilict;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Member member1 = new Member("hi1", 1);
        Member member2 = new Member("hi2", 2);

        Map<Member, String> map = new HashMap<>();
        map.put(member1, "member1");
        map.put(member2, "member2");

        System.out.println(member1.equals(member2));
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
        /* 동일한 hashCode 여도 동작은 잘함 -> hashMap 에서 equals 로 한번더 비교하기 때문 */
        System.out.println(map.get(member1));
        System.out.println(map.get(member2));
    }

}
