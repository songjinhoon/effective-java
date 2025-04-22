package com.example.effectivejava.chapter01.item14.composition;

import com.example.effectivejava.chapter01.item14.Member;
import lombok.experimental.SuperBuilder;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@SuperBuilder
public class AdminMember extends Member {

    private final Integer adminAge;

    public static void main(String[] args) {
        AdminMember adminMember1 = AdminMember.builder()
                .name("hi1")
                .age(1)
                .adminAge(10).build();
        AdminMember adminMember2 = AdminMember.builder()
                .name("hi")
                .age(2)
                .adminAge(20).build();


        /* 비추천방식 */
        Set<AdminMember> adminMembers = new TreeSet<>(new Comparator<AdminMember>() {
            @Override
            public int compare(AdminMember o1, AdminMember o2) {
                return 0;
            }
        });

    }

}
