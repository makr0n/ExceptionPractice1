package Homework;
/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Homework1_3 {
    public static void main(String[] args) {
        int[] first = {1,2,4,5,6};
        int[] second = {1,2,4,5};
        arrSubtraction(first,second);

    }

    public static int[] arrSubtraction(int[] first, int[] second) {
        if (first.length != second.length) {
            System.out.println("Массивы имеют разную длину");
        } else {
            int[] result = new int[first.length];
            for (int i = 0; i < first.length; i++) {
                result[i] = first[i] - second[i];
            }
            return result;
        }
    }
}
