import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        2 vectors with 12 numeric elements each and mix them in a third vector as:
        1A, 2A, 3A, 1B, 2B, 3B, ...
         */
        Scanner e = new Scanner(System.in);
        int[] a, b;

        a = new int[12];
        b = new int[12];
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
        int z=0;
        int w=0;
        for(int i=0;i<(a.length/3);i++){
           for(int k=0; k<3; k++){
               c[j] = a[z];
               z++;
               j++;
           }
            for(int k=0; k<3; k++){
                c[j] = b[w];
                w++;
                j++;
            }

        }
        System.out.println("\nThe third vector is: ");
        for (int k : c) {
            System.out.print(k + " ");
        }
        System.out.println();

    }
}