//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        если вместо массива пришел null, метод вернет -3
//        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у
//        пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
//        Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.


import java.util.Scanner;

public class Task1 {
    private static final int MIN_ARRAY_LENGTH = 9;

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7};
        int[] array1 = null;
        System.out.println(userInterface(getNumberIndex(array, getNumberFromUser())));

    }

    public static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите  целое число: ");
        return scan.nextInt();
    }

    public static String userInterface(int error) {
        String result = "";
        switch (error) {
            case -1 -> result = "Длина массива меньше заданного минимума ";
            case -2 -> result = "Искомый элемент не найден";
            case -3 -> result = "Вместо массива передан null";
            default -> result = "Индекс искомого значения равен " + error;
        }
        return result;
    }


    public static int getNumberIndex(int[] array, int number) {

        if (array == null) {
            return -3;
        } else if (array.length < MIN_ARRAY_LENGTH) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }

            }
        }
        return -2;

    }
}



