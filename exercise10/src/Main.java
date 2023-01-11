import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Displace N-positions for a vector
         */
        Scanner e = new Scanner(System.in);
        int[] a1 ={1,2,3,4,5,6,7,8,9,10};
        int N,aux1;
        System.out.println(a1.length);
        /*for(int i=0;i<a1.length;i++){
            System.out.println("Type number " + (i+1) + " : ");
            a1[i] = e.nextInt();
        }*/
        System.out.println("Enter the N for displace the elements: ");
        N = e.nextInt();
        for(int j=1;j<(N+1);j++) {
            aux1 = a1[a1.length-1];
            for (int i = (a1.length - 2); i >= 0; i--) {
                a1[i + 1] = a1[i];
            }
            a1[0] = aux1;
            for(int k:a1) System.out.print( k + " ");
            System.out.println("\n=============================================");
        }
    }
}
/*
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        int aux,desplaza;

        System.out.println("Llene el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        aux = arreglo[9];

        System.out.println("\nIngrese posiciones a dezplazar");
        desplaza = entrada.nextInt();

        for (int i = desplaza; i > 0; i--) {

            for (int j = 8; j >= 0; j--) {
            arreglo[j+1] = arreglo[j];

            }
            arreglo[0] = aux;
            aux = arreglo[9];
        }

        System.out.println("\nEl arreglo es: ");
        for (int i:arreglo) {
            System.out.print(i+" ");
        }
    }
 */