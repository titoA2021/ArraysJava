import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Read 2 vectors of 10 digits each and combine them in a third vector such as:
        a-1, b-1, a-2, b-2,...
         */
        Scanner e = new Scanner(System.in);
         int[] a, b;

        a = new int[10];
         b = new int[10];
        int[] c = new int[a.length + b.length];

         for(int i=0; i < a.length; i++){
             System.out.println("Type the digit " + (i+1) + ", for vector a: ");
             a[i] = e.nextInt();
         }

         for(int i=0; i < b.length;i++){
             System.out.println("Type the digit " + (i+1) + ", for vector b: ");
             b[i] = e.nextInt();
         }
        int j=0;
         for(int i=0;i<a.length;i++){
             c[j] = a[i];
             j++;
             c[j] = b[i];
             j++;
         }
        System.out.println("\nThe third vector is: ");
        for (int k : c) {
            System.out.println(k + " ");
        }
        System.out.println();
    }
}