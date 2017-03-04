package me.b7w.calculator;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CalculatorAfter implements Calculator {

    @Inject
    private CalculatorPlusStrategy plusStrategy;

    @Inject
    private CalculatorSubtractStrategy subtractStrategy;

    @Override
    public Integer execute(Integer left, Operator operator, Integer right) {
        if (Operator.PLUS.equals(operator)) {
            return plusStrategy.execute(left, right);
        }
        if (Operator.SUBTRACK.equals(operator)) {
            return subtractStrategy.execute(left, right);
        }
        throw new IllegalStateException();
    }

}
