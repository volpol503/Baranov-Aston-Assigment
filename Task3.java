package Aston;

/*
Условие:

Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо
написать программу, которая выведет в консоль все чётные числа

*/

public class Task3 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа из массива:");
        System.out.print("{ ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.print("}");
    }
}