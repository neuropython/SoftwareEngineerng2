package org.example;
import org.example.Calculator;


public class CalculatorLauncher {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int x = calculator.add(1,2);
    int y = calculator.substract(1,2);
    System.out.println(x);
    System.out.println(y);

    };
}
