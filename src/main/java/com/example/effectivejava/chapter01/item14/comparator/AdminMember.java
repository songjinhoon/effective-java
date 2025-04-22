package com.example.effectivejava.chapter01.item14.comparator;

import com.example.effectivejava.chapter01.item14.Member;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import static java.util.Comparator.comparingInt;

@Getter
@SuperBuilder
public class AdminMember extends Member {

    private final Integer adminAge;

    @Override
    public int compareTo(Member o) {
        return comparingInt(AdminMember::getAge)
                .thenComparing(AdminMember::getName)
                .thenComparingInt(AdminMember::getAdminAge)
                .compare(this, (AdminMember) o);
    }

}
