package Homework2;

import java.io.FileNotFoundException;

public class Homework2_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;  //Необходимо  либо убрать catch c Throwable, так как он является базовым классом всех исключений Java и тогда последующие блоки catch не имеют смысла. Либо удалить блоки с конкретными исключениями.
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }


}
