package com.example.effectivejava.chapter01.item01;

/*
* 단점2 극복을 위한 자바독 활용
* */
public class Category {

    private static final Category category = new Category();

    /*
     * 단점1 - 접근제한자로 인해 상속 불가능함
     * 그렇지만,,, 일부로 public 으로 풀어 사용하는경우도 있음, ex)List
     * 또한 클래스안에서 필드로 선언하여 상속없이도, 기능 활용은 가능함
     *  */
    private Category() {
    }

    public static Category newInstance() {
        return category;
    }

    /* 단점2 극복을 위한 네이밍 패턴 */
    public static Category of() {
        return category;
    }

    public static Category getInstance() {
        return category;
    }

    public static Category newInstance(String categoryName) {
        return category;
    }

}
