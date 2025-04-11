package com.example.effectivejava.chapter01.item03;

public class Concert {

    private final String name;

    private final IElvis elvis;

    public void perform() {
        /* perform process */
        elvis.sing();
    }

    public Concert(IElvis elvis) {
        this.name = "apple";
        this.elvis = elvis;
    }

}
