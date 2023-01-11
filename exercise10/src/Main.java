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
