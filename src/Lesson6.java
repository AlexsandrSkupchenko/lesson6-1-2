import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {

        Array arrayUtil = new Array();
        int[] firstArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(arrayUtil.validateArray(firstArray, 1, 4));
        System.out.println(Arrays.toString(arrayUtil.extractFromArray(firstArray, 4)));

        Array arrayUtil1 = new Array();
        int[] firstArray1 = {1, 2, 1, 4, 2, 3, 2, 1, 7};
        System.out.println(arrayUtil1.validateArray(firstArray1, 1, 4));
        System.out.println(Arrays.toString(arrayUtil1.extractFromArray(firstArray1, 4)));

        Array arrayUtil2 = new Array();
        int[] firstArray2 = {5, 2, 3, 9, 2, 3, 5, 8, 7};
        System.out.println(arrayUtil2.validateArray(firstArray2, 1, 4));
        System.out.println(Arrays.toString(arrayUtil2.extractFromArray(firstArray2, 4)));
    }



}