package com.example.effectivejava.chapter01.item03;

public class Elvis implements IElvis {

    /**
     * 싱글톤 오브젝트 -> 자바독에서 확인하기 쉽다.
     */
    public static final Elvis INSTANCE = new Elvis();

    private static boolean  created;

    private Elvis() {
        if (created) {
            throw new IllegalStateException("Already Created");
        }
        created = true;
    }

    public void sing() {
        System.out.println("Elvis sing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
    }

}
