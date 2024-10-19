package org.example;
import org.example.Calculator;


public class CalculatorLauncher {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double x = calculator.add(1,2);
    double y = calculator.substract(1,2);
    double z = calculator.multiply(1,2);
    double j = calculator.division(1,2);
//    double i = calculator.division(1,0);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(j);
    };
}
