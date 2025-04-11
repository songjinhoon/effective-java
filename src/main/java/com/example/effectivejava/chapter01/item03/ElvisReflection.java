package com.example.effectivejava.chapter01.item03;

import java.lang.reflect.Constructor;

public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> constructor = Elvis.class. getDeclaredConstructor();
            constructor.setAccessible(true);
            Elvis elvis = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
