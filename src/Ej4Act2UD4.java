public class Ej4Act2UD4 {
    public static void main(String[] args) {
        int [] numeros= {-35, -13, -77, -46, -82, -2, -26};

        int minimo=numeros[0];

        for (int i=1; i< numeros.length; i++) {
            if (numeros[i] > minimo) {
                minimo=numeros[i];
            }
        }

        System.out.println("El mínimo de la colección es: " + minimo);
    }
}
