package com.ayang.spring5;

/**
 * @author Ayang
 * @date 2021/3/6 - 15:02
 */
public class Order {
    private String orderName;
    private String customer;
    public Order(String orderName, String customer) {
        this.orderName = orderName;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}
