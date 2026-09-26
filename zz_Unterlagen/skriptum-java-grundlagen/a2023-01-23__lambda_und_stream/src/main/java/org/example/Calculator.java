package org.example;

public class Calculator {

    public int calculate(BinaryOperation op, int a, int b) {
        int result = op.operation(a, b);
        System.out.println("Result of op(" + a + ", " + b + ") = " + result);
        return result;
    }

}
