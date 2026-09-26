package org.example;

public interface BinaryOperation {

    /**
     * Defines a mathematical binary operation on integer values with an integer result.
     * Examples might be addition, subtraction, multiplication and division. The operation
     * is defined in the subclass implementing this interface
     * @param a Operand 1
     * @param b Operand 2
     * @return Result of the binary operation performed on a and b
     */
    public int operation(int a, int b);

}
