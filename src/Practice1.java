public class Practice1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4};
        System.out.println(getArrLength(arr));



    }

    private static final int MIN_ARRAY_LENGTH = 1;

    public static int getArrLength(int[] array) {
        if (array.length < MIN_ARRAY_LENGTH) {
            return -1;
        } else {
            return array.length;
        }
    }
}
