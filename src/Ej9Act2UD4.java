public class Ej9Act2UD4 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4, 5};
        int[] array2={1, 2, 3, 4, 5};
        int[] array3={5, 4, 3, 2, 1};

        System.out.println("Array1 es igual a Array2: " + equalsArrays(array1, array2));
        System.out.println("Array1 es igual a Array3: " + equalsArrays(array1, array3));

    }

    static boolean equalsArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i =0; i< arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
