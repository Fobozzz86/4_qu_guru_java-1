package ru.fobozzz.hw;

import java.util.Scanner;

public class LogicOperators {

    public static void main(String[] args) {
        Scanner disease = new Scanner(System.in);
        System.out.println("У Вас есть хронические заболевания? да или нет:");
        String trouble = disease.nextLine();
        if (trouble.equals("да")) {
            System.out.println("Вы не можите прыгать с тарзанки!!!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Ваш полный возраст:");
            int age = scanner.nextInt();
            System.out.println("Введите Ваш рост:");
            int height = scanner.nextInt();
            if (age >=18 && height >=180) {
                System.out.println("Добро пожаловать на аттракцион!!!");
            } else {
                System.out.println("Вы не можете прыгать с тарзанки!!!");
            }
        }
    }
}
