package com.example.effectivejava.chapter01.item04;

public abstract class CustomUtility {

    /**
     * 주석을 달라고 책에선 추천함
     */
    public CustomUtility() {
        System.out.println("CustomUtility");
    }

    public static void sing() {
        System.out.println("CustomUtility.sing()");
    }

    public static class DefaultUtility extends CustomUtility {

    }

    public static void main(String[] args) {
        CustomUtility.sing();
        DefaultUtility defaultUtility  = new DefaultUtility();
//        defaultUtility.sing();
    }

}
