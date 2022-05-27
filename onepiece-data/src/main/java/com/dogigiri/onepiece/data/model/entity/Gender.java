package com.dogigiri.onepiece.data.model.entity;

public enum Gender {
    NOT_KNOWN(0), FEMALE(1), MALE(2), NOT_APPLICABLE(3);

    final private int value;

    Gender(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
