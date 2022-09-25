package Homework3;


public class Homework3_1 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] matrix1 = {
                {"0", "3", "2", "3"},
                {"1", "3", "2", "1"},
                {"1", "3", "2", "0"},
                {"1", "3", "2", "0"}
        };
        String[][] matrix2 = {
                {"2", "3", "2", "0"},
                {"1", "3", "Number", "0"},
                {"1", "3", "2", "0"},
                {"1", "3", "2", "0"}
        };
        String[][] matrix3 = {
                {"0", "3", "2", "3"},
                {"1", "3", "2", "1"},
                {"1", "3", "2", "0"}
        };

        String[][] matrix4 = {
                {"0", "3", "2", "0"},
                {"1", "3", "2"},
                {"1", "3", "2", "0"},
                {"1", "3", "2", "0"}
        };

        String[][] matrix5 = {
                {"0", "3", "2"},
                {"1", "3", "2"},
                {"1", "3", "2"},
                {"1", "3", "2"}
        };

        System.out.println(matrixSum(matrix1));
        System.out.println(matrixSum(matrix2));


    }


    public static int matrixSum(String[][] matrix) throws MyArraySizeException, MyArrayDataException {

        if (matrix.length != 4) {
            throw new MyArraySizeException("Матрица должна иметь размер 4х4");
        } else {
            for (String[] strings : matrix) {
                if (matrix.length != strings.length) {
                    throw new MyArraySizeException("Матрица должна иметь размер 4х4");
                }
            }

        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка перевода в ячейке [" + i + "]" + "[" + j + "]");
                }
            }

        }
        return sum;
    }

}
