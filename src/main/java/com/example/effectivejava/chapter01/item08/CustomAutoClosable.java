package com.example.effectivejava.chapter01.item08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomAutoClosable implements AutoCloseable {

    private BufferedReader bufferedReader;

    public CustomAutoClosable(String path) {
        try {
            this.bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }

    public static void main(String[] args) {
        try(CustomAutoClosable customAutoClosable = new CustomAutoClosable("./example/custom.txt")) {
            // 자동 자원 반납
            System.out.println("hello");

        }
    }

}
