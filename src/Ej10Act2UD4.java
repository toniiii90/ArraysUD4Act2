import java.util.Arrays;

public class Ej10Act2UD4 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4, 5};
        int[] array2={2, 1, 3, 5, 4};
        int[] array3={1, 2, 3, 4, 7};

        System.out.println("Array1 es igual a Array2: " + equalsArraysIgnoreOrder(array1, array2));
        System.out.println("Array1 es igual a Array3: " + equalsArraysIgnoreOrder(array1, array3));
    }

    static boolean equalsArraysIgnoreOrder(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0; i< arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
