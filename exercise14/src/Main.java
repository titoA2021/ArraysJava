import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           create 2 arrays of 10 elements each, ordered increasingly.
           United both vectors and the result should be ordered increasingly.
         */

        Scanner e = new Scanner(System.in);
        int[] a1=new int[5];
        int[] a2=new int[5];
        int[] a3=new int[10];
        boolean flag = true;

        do {
            System.out.println("Array 1: ");
            for(int i=0;i<a1.length;i++){
                System.out.println("Type number " + (i+1) + " : ");
                a1[i]= e.nextInt();
            }
            for(int i=0;i<a1.length-1;i++){
                if(a1[i]<a1[i+1]){
                    flag = true;
                } else if (a1[i]>a1[i+1]) {
                    flag = false;
                }
            }
            if(!flag){
                System.out.println("The vector 1 is not ordered in increasing order");
            }

        }while(!flag);

        do {
            System.out.println("Array 2: ");
            for(int i=0;i<a2.length;i++){
                System.out.println("Type number " + (i+1) + " : ");
                a2[i]= e.nextInt();
            }
            for(int i=0;i<a2.length-1;i++){
                if(a2[i]<a2[i+1]){
                    flag = true;
                } else if (a2[i]>a2[i+1]) {
                    flag = false;
                }
            }
            if(!flag){
                System.out.println("The vector 2 is not ordered in increasing order");
            }

        }while(!flag);

        int indaux1=0;
        int indaux2=0;

        /*for(int j=0;j < a1.length;j++) {
            if (a1[j] <= a2[j]) {
                a3[indaux1] = a1[j];
                a3[indaux1+1] = a2[j];
                indaux1 += 2;

            } else if (a1[j] > a2[j]) {
                a3[indaux1] = a2[j];
                a3[indaux1+1] = a1[j];
                indaux1+=2;
            }
        }*/

        for(int j=0;j < a3.length-1;j++) {
            if (a1[indaux1] <= a2[indaux2]) {
                System.out.println("a1[indaux1]: " + a1[indaux1] + " - a2[indaux2]: " + a2[indaux2]);
                a3[j] = a1[indaux1];
                System.out.println("a3[j]: " + a3[j] + " - indaux1: " + indaux1);
                indaux1++;
                System.out.println("indaux1: " + indaux1);

            } else if (a1[indaux1] > a2[indaux2]) {
                System.out.println("a1[indaux1]: " + a1[indaux1] + " - a2[indaux2]: " + a2[indaux2]);
                a3[j] = a2[indaux2];
                System.out.println("a3[j]: " + a3[j] + " - indaux2: " + indaux2);
                indaux2++;
                System.out.println("indaux2: " + indaux2);
            }
        }
        a3[a3.length - 1] = Math.max(a1[a1.length - 1], a2[a2.length - 1]);

        System.out.println("The final vector is: ");
        for (int k:a3) System.out.print(k + " ");

    }
}