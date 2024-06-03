package Aston;
/*
Условие:

Написать программу, которая принимает на вход два целых числа (a и b) и
совершает с ними следующие действия:

- сравнивает эти два числа и возвращает результат сравнения путем вывода
в консоль одного из вариантов: "a > b", "a < b" или "a = b";

- совершает с этими числами операции сложения, вычитания, деления
и умножения и результат выводит в консоль


*/
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (b != 0) ? (double) a / b : Double.NaN;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        if (b != 0) {
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
    }
}

