package Aston;

/*
Условие:

 Написать программу, которая принимает на вход две строки (a и b) и
 сравнивает их. В результате сравнения в консоль должно быть
 выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"


*/
import java.util.Scanner;
public class Task2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первую строку (a): ");
            String a = scanner.nextLine();

            // Просим пользователя ввести вторую строку
            System.out.println("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
}
