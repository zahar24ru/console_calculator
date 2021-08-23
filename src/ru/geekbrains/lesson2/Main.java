package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выбор операций \n 1.Сложение \n 2.Вычитание \n 3.Умножение \n 4.Деление \n 5.Остаток");
        Scanner scanner = new Scanner(System.in);
        int a, b, operation, result;
        operation = scanner.nextInt();

        if (operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5) {
            System.out.println("Допущена ошибка в выборе действия. Действие № " + operation + " Не найдено");
            return;
        }
        System.out.println("Введите число А");
        a = scanner.nextInt();
        System.out.println("Введите число B");
        b = scanner.nextInt();
        result = 0;

        if (operation == 1) {
            result = a + b;

        }
        if (operation == 2) {
            result = a - b;

        }
        if (operation == 3) {
            result = a * b;

        }
        if (operation == 4) {
            if (b == 0) {
                System.out.println("Делить на ноль нельзя");
                return;
            }
            result = a / b;

        }
        if (operation == 5) {
            if (b == 0) {
                System.out.println("Делить на ноль нельзя");
                return;
            }
            result = a % b;

        }  {
            System.out.println("Результат = " + result);

        }

    }
}
