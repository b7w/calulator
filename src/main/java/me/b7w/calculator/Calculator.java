package me.b7w.calculator;


public interface Calculator {
    enum Operator {
        PLUS,
        SUBTRACK
    }

    Integer execute(Integer left, Operator operator, Integer right);
}
