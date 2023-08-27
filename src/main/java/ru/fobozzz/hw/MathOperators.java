package ru.fobozzz.hw;

public class MathOperators {
    public static void main(String[] args) {

        int d = 45;
        int c = 37;
        int f = 37;
        double g = 2.3;

        int addition = d + c;
        int subtraction = c - d;
        int multiplication = c * d;
        int division = d / c; // без остатка
        int remainder = d % c; // возврат остатка
        int overflow = 2147483647 + 5; // переполнение

        System.out.println("------------MathOperators------------");
        System.out.println("d + c = " + addition);
        System.out.println("d - c = " + subtraction);
        System.out.println("d * c = " + multiplication);
        System.out.println("d / c = " + division);
        System.out.println("d % c = " + remainder);
        System.out.println("overflow " + overflow);
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
        System.out.println("c-- = " + (c--));
        System.out.println("--c = " + (--c));

        System.out.println("------------СomparisonOperators------------");
        System.out.println("d > c = " + (d > c));
        System.out.println("d < c = " + (d < c));
        System.out.println("d == c = " + (d == c));
        System.out.println("d != c = " + (d != c));
        System.out.println("f >= c = " + (f >= c));
        System.out.println("f <= d = " + (f <= d));

        System.out.println("------------Сombination------------");
        System.out.println("int d + double g = " + (d + g));
        System.out.println("int d - double g = " + (d - g));
        System.out.println("int d * double g = " + (d * g));
        System.out.println("int d / double g = " + (d / g));



    }


}
