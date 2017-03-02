package me.b7w.calculator;

import org.junit.jupiter.api.Test;


class CalculatorBeforeTest {

    @Test
    void executePlus() {
        // given
        CalculatorBefore calculator = new CalculatorBefore();

        // when
        Integer value = calculator.execute(1, Calculator.Operator.PLUS, 1);

        // then
        assert value.equals(2);
    }

    @Test
    void executeSubtract() {
        // given
        CalculatorBefore calculator = new CalculatorBefore();

        // when
        Integer value = calculator.execute(1, Calculator.Operator.SUBTRACK, 1);

        // then
        assert value.equals(0);
    }

}