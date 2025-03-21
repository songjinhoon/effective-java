package com.example.effectivejava.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class Item01Tester {

    public static void main(String[] args) {
//        new Category();

        /* 장점2 */
        Category category = Category.newInstance();

        /* 장점5 */
        ServiceLoader<UploadService> loader = ServiceLoader.load(UploadService.class);
        Optional<UploadService> service = loader.findFirst();
        service.ifPresent(System.out::println);
    }

}
