package me.b7w.calculator;

import org.springframework.stereotype.Component;


@Component
public class CalculatorSubtractStrategy {

    public Integer execute(Integer left, Integer right) {
        return left - right;
    }
}
