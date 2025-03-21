package com.example.effectivejava.chapter01.item01;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    /* 시그니처 같음 */
//    public Order(boolean prime, Product product) {}
//    public Order(boolean urgent, Product product) {}
    /* 그렇다고 이건 아니지 */
//    public Order(Product product, boolean prime) {}

    /* 장점1 */
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

}
