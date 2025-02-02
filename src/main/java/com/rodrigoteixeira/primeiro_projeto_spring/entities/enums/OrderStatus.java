package com.rodrigoteixeira.primeiro_projeto_spring.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int value;

    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static OrderStatus valueOf(int value) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getValue() == value) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus: " + value);
    }
}
