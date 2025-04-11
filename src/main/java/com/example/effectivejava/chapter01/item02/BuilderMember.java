package com.example.effectivejava.chapter01.item02;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(access = AccessLevel.PRIVATE) // 이거 안쓰면 외부에서 모든생성자로 인스턴스 생성이 가능함
@Builder
public class BuilderMember {

    private String name;

    private int age;

    private int number;

    public static void main(String[] args) {
        /* 사실이게아니라 원래는 Builder 자체를 구현해야함, 근데 코드량이 많아짐 */
        BuilderMember builderMemberBuilder = new BuilderMemberBuilder()
                .name("!")
                .age(1)
                .number(2)
                .build();
    }

}
