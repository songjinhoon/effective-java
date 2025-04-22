package com.example.effectivejava.chapter01.item14;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Member implements Comparable<Member> {

    private final String name;

    private final Integer age;

    @Override
    public int compareTo(Member o) {
        int result = age.compareTo(o.age);
        if (result == 0) {
            result = name.compareTo(o.name);
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
