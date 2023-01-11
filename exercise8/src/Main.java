import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Store 10 elements in an array. Ask for 8 numbers, then ask for a number and position,
        reorganized the vector and show the final result
         */

        Scanner e = new Scanner(System.in);

        int[] a1 = new int[10];
        int aux1, aux2;
        System.out.println("Enter 8 numbers: ");
        for (int i = 0; i < a1.length; i++) {
            if(i>=8){
                System.out.println("\nType number " + (i + 1) + " : ");
                aux1= e.nextInt();
                System.out.println("\nType position for " + aux1 + " : ");
                aux2=e.nextInt();
                for(int j=8;j>aux2;j--){
                    a1[j+1] = a1[j];
                }
                a1[aux2-1]= aux1;
            }else{
                System.out.println("Type number " + (i + 1) + " : ");
                a1[i] = e.nextInt();
            }
        }

        for (int k : a1) {
            System.out.print(k + " ");
        }
    }
}