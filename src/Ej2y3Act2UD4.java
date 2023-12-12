public class Ej2y3Act2UD4 {
    public static void main(String[] args) {
        int [] numeros= {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        int maximo=numeros[0];

        for (int i=1; i< numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo=numeros[i];
            }
        }
        System.out.println("El máximo de la colección es: " + maximo);

        // He utilizado un bucle for para recorrer la colección y se compara cada elemento
        // con la variable 'maximo'.



    }
}
