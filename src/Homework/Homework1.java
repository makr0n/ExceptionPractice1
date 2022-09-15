package Homework;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Homework1 {
    public static void main(String[] args) {
        String[] array = new String[5];
        String s = "Brine";
        String a = " Text for method 3 ";
        method1(array, s);
        method2(s);
        method3(a);


    }

    public static void method1(String[] arr, String s) { //ArrayIndexOutOfBoundsException неверно указан диапазон
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = s;
        }
    }


    public static int method2(String s) { //NumberFormatException, нельзя перевести текст в  целое число
        return Integer.parseInt(s);
    }

    public static void method3(String s) { //StringIndexOutOfBoundsException выход за пределы строки
        char c = s.charAt(24);
        System.out.println(c);
    }
}

