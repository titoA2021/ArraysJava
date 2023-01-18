import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Array with 10 elements ordered in increasing order, then ask for a number and show
        the index of the number, tell if N is not in the array
         */

        Scanner e = new Scanner(System.in);
        int[] a1= new int[10];
        int N;
        boolean flag = true;

        do {
            System.out.println("Array: ");
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

        System.out.println("Type the N number to find: ");
        N = e.nextInt();
        int index=0;
        boolean found = false;

        for(int k=0;k< a1.length;k++){
            if(a1[k]==N){
                found = true;
                index = k;
                break;
            }
        }
        if(found) System.out.println("The number " + N + " is located in the " + (index+1) + " position");
        else System.out.println("The number is not in the array.");
    }
}