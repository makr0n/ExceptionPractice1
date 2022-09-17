package Homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
 */
public class Homework2_1 {
    public static void main(String[] args) {
        method1();
    }

    public static float method1() {
        while (true) {
            System.out.print("Введите число float: ");
            Scanner scan = new Scanner(System.in);
            try {
                float number = scan.nextFloat();
                System.out.println("Вы ввели число " + number);
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод данных");
            }
        }
    }

}
