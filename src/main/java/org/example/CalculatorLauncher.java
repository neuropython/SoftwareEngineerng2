package org.example;
import org.example.Calculator;


public class CalculatorLauncher {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int sum = calculator.add(1,2);
    System.out.println(sum);
    };
}
