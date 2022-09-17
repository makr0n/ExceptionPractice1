package Homework2;
/*

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */
public class Homework2_2 {
    public static void main(String[] args) {  //возможные ошибки: деление на 0, вызов элемента  за пределами массива.
        int[] intArray = new int[5];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println();
        } catch (IndexOutOfBoundsException e) {  //Добавляем catch с обработкой ошибки вызова элемента за пределами массива
            System.out.println("Catching exception: " + e);
            System.out.println();

        }

    }
}
