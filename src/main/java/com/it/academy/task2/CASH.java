package com.it.academy.task2;

public enum CASH {

    _25(25), _50(50), _100(100);

    private int value;

    CASH(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
