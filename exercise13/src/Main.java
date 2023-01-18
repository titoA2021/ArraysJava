import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Read 10 integer numbers in an array, then split it in 2 arrays, pair and non pair
         */
        Scanner e = new Scanner(System.in);
        int[] a1=new int[10];
        int conP=0, conNP=0;

        for(int i=0;i<a1.length;i++){
            System.out.println("Type number " + (i+1) + " : ");
            a1[i]=e.nextInt();
            if(a1[i]%2==0){
                conP++;
            } else {
                conNP++;
            }
        }
        int[] pair=new int[conP];
        int[] nopair=new int[conNP];

        conP = 0;
        conNP =0;

        for (int value : a1) {
            if (value % 2 == 0) {
                pair[conP] = value;
                conP++;
            } else {
                nopair[conNP] = value;
                conNP++;
            }
        }

        System.out.println("\nFirst array");
        for(int j:a1) System.out.print(j + " ");
        System.out.println("\nPair array: ");
        for(int k:pair) System.out.print(k + " ");
        System.out.println("\nNon-Pair Array");
        for(int l:nopair) System.out.print(l + " ");
    }
}