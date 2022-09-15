/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

 */

public class Task2 {
    public static void main(String[] args) {

    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == 0 || matrix[i][j] == 1) {
                        sum += matrix[i][j];
                    }else {
                        throw new RuntimeException("Not 0 and 1");
                    }
                }
            }
            return sum;
        } else {
            throw new RuntimeException("Not square");
        }
    }


}
