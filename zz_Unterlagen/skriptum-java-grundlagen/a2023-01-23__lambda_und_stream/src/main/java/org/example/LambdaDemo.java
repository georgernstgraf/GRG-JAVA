package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        variantClassImplementsInterface();
        variantAnonymousClassImplementsInterface();
        variantWithLambdas();
        furtherThings();
        exampleSortingWithLambdas();
    }

    public static void variantClassImplementsInterface() {
        System.out.println("Variant with Classes implementing the Interface: ");
        Calculator calc = new Calculator();
        calc.calculate(new BinaryOperationAddition(), 3, 5);
        calc.calculate(new BinaryOperationSubtraction(), 10, 4);
        calc.calculate(new BinaryOperationMultiplikation(), 2, 6);
        // disadvantage: classes BinaryOperationAddition, BinaryOperationSubtraction,
        // BinaryOperationMultiplikation need to be created (3 files, ~10 lines of code)
    }

    public static void variantAnonymousClassImplementsInterface() {
        System.out.println("Variant anonymous class implements interface: ");
        Calculator calc = new Calculator();
        calc.calculate(new BinaryOperation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        }, 3, 5);

        calc.calculate(new BinaryOperation() {
            @Override
            public int operation(int a, int b) {
                return a-b;
            }
        }, 10, 4);

        calc.calculate(new BinaryOperation() {
            @Override
            public int operation(int a, int b) {
                return a*b;
            }
        }, 2, 6);
        // advantage: no classes implementing BinaryOperation need to be created (in a seperate file).
        // disadvantage: many lines of code, lots of redundancies. The only really relevant lines are
        // the return statements, including the actual operation to be performed
    }

    public static void variantWithLambdas() {
        System.out.println("Variant with Lambda-Expressions (Lambdas): ");
        Calculator calc = new Calculator();

        // The method operation of BinaryOperation is implicitly overridden with
        // (int a, int b) -> { return a+b; }
        // No method name is provided, because the method is uniquely identified
        // (BinaryOperation declares only one method).
        calc.calculate( (int a, int b) -> { return a+b; }, 3, 5 );

        // We can even omit the types, "return", and the curly braces (if there is only one statement)
        calc.calculate( (a, b) -> (a-b), 10, 4);

        calc.calculate( (a, b) -> (a*b), 2, 6);

    }

    private static void furtherThings() {
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(3, 1, 5, 6, 12, 3, 5));
        values.forEach(n -> System.out.println(n));

        // or like this:
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        values.forEach(method);
    }

    private static void exampleSortingWithLambdas() {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(3, 1, 5, 6, 12, 3, 5, -3, 44, 0, 1, 5));
        Collections.sort(values, (a, b) -> (a-b)); // sort ascending
        System.out.println("Values: " + values);
        // The lambda expression implicitly overrides the compareTo method defined in Comparator

        values.clear();
        values.addAll(Arrays.asList(3, 1, 5, 6, 12, 3, 5, -3, 44, 0, 1, 5));
        Collections.sort(values, (a, b) -> (b-a)); // sort descending
        System.out.println("Values: " + values);

        values.clear();
        values.addAll(Arrays.asList(3, 1, 5, 6, 12, 3, 5, -3, 44, 0, 1, 5));
        values.sort((a, b) -> (a-b));
        System.out.println("Values: " + values);
    }

}
