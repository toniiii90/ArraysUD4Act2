import java.util.Scanner;

public class Ej1Act2UD4 {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es el tamaño del array? ");
        int size=sc.nextInt();

        array = new int[size];

        for (int i=0; i< array.length; i++) {
            System.out.println("Inserta un entero: ");
            array[i] = sc.nextInt();
        }

        // He colocado el entero size como longitud del array.



    }
}
