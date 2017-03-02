package me.b7w.calculator;

import org.springframework.stereotype.Component;

@Component
public class CalculatorBefore implements Calculator {

    @Override
    public Integer execute(Integer left, Operator operator, Integer right) {
        if (Operator.PLUS.equals(operator)) {
            return left + right;
        }
        if (Operator.SUBTRACK.equals(operator)) {
            return left - right;
        }
        throw new IllegalStateException();
    }

}
