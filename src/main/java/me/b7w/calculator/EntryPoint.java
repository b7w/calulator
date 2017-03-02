package me.b7w.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EntryPoint implements CommandLineRunner {

    @Autowired
    private CalculatorBefore before;

    @Autowired
    private CalculatorAfter after;

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("Before");
        System.out.println("1 + 1 = " + before.execute(1, Calculator.Operator.PLUS, 1));

        System.out.println("After");
        System.out.println("1 + 1 = " + after.execute(1, Calculator.Operator.PLUS, 1));

    }
}
