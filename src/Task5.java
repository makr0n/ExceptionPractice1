//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику (через коды ошибок или исключения):
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Task5 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 2};
        checkArr(array);

    }

    public static void checkArr(Integer[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                System.out.println("В ячейке " + i + " находится null");
                sb.append(i + " ");

            }
        }
        if (sb.length() == 0) {
            sb.append("не ");
        }
        System.out.print("В ячейках " + sb.toString() + "находится null");
    }




}
