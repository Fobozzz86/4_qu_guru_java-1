package ru.fobozzz.lesson;

public class Main {
    public static void main(String[] args) {

 //      Приметивные типы данных
 //      1. Целочисленные типы данных
        byte varByte = 10; // 8bit (1 байт) -128 ... 127 2^(bits -1) 2^7
        short varShort = 10; // 16bit (2 байта) -32678 ... 32767 2^15
        int varInt = 10; //* любой литерал в java по умолчанию int // 32bit (4 байта) -2147483648 ... 2147483647 2^31
        long varLong = 10L; //(L - литерал Long) // 64bit (8 байт) –9223372036854775808 ... 9223372036854775807 2^63

        varInt = varByte;
        varInt = (int) varLong;

 //      2. Числа с плавающей точкой
        float varFloat = 1.2F; // 32bit
        double varDouble = 1.2; //* 64bit

 //      3. Символьный тип
        char varChar = 'a';

 //     4. Логический тип
        boolean varBoolean = true; //*

 //       Ссылочные (объектные)
        String s = "Hi?World!";
        Phone iphone = new Phone();
        iphone.printName();

 //     Операторы
 //       1. Присвоение =
        String s1 = "Hi?World!";
 //       2. Арифметические +, -, *, /, %(остаток от деления)
        int result0 = 10 + 50;
        int divideResult = 7/3; // 2
        int residueResult = 7%3; // 1 (остаток)
 //       3. Сравнения >, <, >=, <=, !=, == (равно)
        boolean result = 3 > 3;
        boolean result1 = "Artem".equals("Artem");
 //       4. Логические &, && (будет вычисляться пока ответ не будет очевидным), |, ||, !
        int age = 33;
        String sex = "male";
        boolean canDrinkAlchogolAnd = age > 18 && sex.equals("male");
        boolean canDrinkAlchogolOr = age > 18 || sex.equals("male");
        boolean canDrinkAlchogolInvert = !(age > 18 && sex.equals("male"));

        String name = "Artem";
        boolean canDrinkAlchogolByName = name != null && name.equals("Artem");
 //     5. instanceof
        boolean isString = name instanceof String;
//      6. Тернарный ? :                                                //!!! В ТЕСТАХ не ДОЛЖНО Быть Ветвлений
        boolean canDrinkAlchogol = sex.equals("male") ? true : false;

        String processor = "m1";
        int coreCount = processor.equals("m1")
                ? 2
                : 4;

          if (processor.equals("m1")) {
            coreCount = 2;
        } else if (processor.equals("intel")) {
            coreCount = 4;
        }
          else {
            coreCount = 8;
        }

    }

    public static int calculate(int first, int second) {
        return first + second;

    }
}
