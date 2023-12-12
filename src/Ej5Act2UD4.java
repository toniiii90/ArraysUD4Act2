public class Ej5Act2UD4 {
    public static void main(String[] args) {
        int[] pagoSemanal= {987, 688, 1324, 450, 667, 801};
        int sum=0;

        for (int j=0; j<=6; j++)
            sum += pagoSemanal[j];

        // Al ejecutar este código, el programa lanza una excepción 'ArrayIndexOutOfBoundsException'.
        // El bucle debe ir hasta <6.


    }
}
