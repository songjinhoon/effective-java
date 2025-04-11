package com.example.effectivejava.chapter01.item02;

public class NutritionFacts {

    /* 필수 */
    private final int servingSize;

    /* 필수 */
    private final int servings;

    /* 선택 */
    private final int calories;

    /* 선택 */
    private final int fat;

    /* 점층적 생성자 패턴 */
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }


    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
    }
    /* 점층적 생성자 패턴 */

    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts(10, 10);
    }
}
