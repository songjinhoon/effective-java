package com.example.effectivejava.chapter01.item02;

import lombok.Setter;

@Setter
public class Member {

    private String name;

    private int age;

    private int number;

    /* 자바 빈즈 패턴 */
    public static void main(String[] args) {
        Member member = new Member();
        member.setAge(1);
        member.setName("name");
        member.setNumber(1);
    }

}
