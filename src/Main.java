public class Main {
    public static void main(String[] args) {
        //estructura de datos que permite almacenar un conjunto de datos de un primer momento,
        // deben tener un valor inicial

        /*
        Array unidimensional

        Siempre comienzan desde 0 hasta n-1
        TipoVariable[] NombreArray = new TipoVariable[dimensión];

        numero[0]=5
        int[] numeros = {5,7,9}
         */

        int[] numeros = {5,7,9};

        int[] numero = new int[3];
        numero[0] = 7;
        numero[1] = 10;
        numero[2] = 13;

        for(int i=0; i<3; i++ ){
            System.out.println(numero[i]);
        }
    }
}