package app;

import java.util.Locale;
import java.util.Scanner;

import calc.Calculator;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter number ");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Enter oparator (+, -, *, /)");
        String operator = input.nextLine();
        System.out.println("Enter number ");
        double b = input.nextDouble();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operator);
        System.out.println(a + operator + b + " = " + result);
    }
}