package com.example.effectivejava.chapter01.item14.test;

import com.example.effectivejava.chapter01.item14.Member;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdminMember implements Comparable<AdminMember>{

    private final Member member;

    private final Integer adminAge;

    @Override
    public int compareTo(AdminMember o) {
        int result = adminAge.compareTo(o.adminAge);
        if (result == 0) {
            result = member.compareTo(o.member);
        }
        return result;
    }

}
