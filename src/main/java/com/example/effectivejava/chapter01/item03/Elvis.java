package com.example.effectivejava.chapter01.item03;

public class Elvis implements IElvis {

    /**
     * 싱글톤 오브젝트 -> 자바독에서 확인하기 쉽다.
     */
//    public static final Elvis INSTANCE = new Elvis();
    private static final Elvis INSTANCE = new Elvis();

    private static boolean  created;

    private Elvis() {
        if (created) {
            throw new IllegalStateException("Already Created");
        }
        created = true;
    }

    public static Elvis getInstance() {
        return INSTANCE; // 클라이언트 코드 변경없이 new Elvis() 를 리턴하면 싱글톤이 아니게 변경할 수 있음
    }

    public void sing() {
        System.out.println("Elvis sing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
    }

}
