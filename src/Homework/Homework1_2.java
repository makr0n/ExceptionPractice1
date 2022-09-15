package Homework;
/*
1.ArrayIndexOutOfBoundsException
2.NumberFormatException

 */

public class Homework1_2 {
    public static void main(String[] args) {
        String[][] strMatrix = {{"1", "6", "0"},
                {"1", "number", "0"},
                {"1", "6", "2.4"}};

        sum2d(strMatrix);


    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
