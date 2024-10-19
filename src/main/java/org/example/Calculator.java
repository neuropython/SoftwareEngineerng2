package org.example;

public class Calculator  {
    int n1;
    int n2;

    public double add(double n1, double n2) {
        return n1 + n2;
    }
    public double substract(double n1, double n2) {
        return n1 - n2;
    }
    public double multiply (double n1, double n2) {return n1 * n2;}
    public double division(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return n1 / n2;
    }
}
