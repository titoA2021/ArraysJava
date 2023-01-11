import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int [] a1 = new int[10];
        System.out.println(a1.length);
        for(int i=0;i<a1.length;i++){
            System.out.println("Type number " + (i+1) + " : ");
            a1[i] = e.nextInt();
        }
        int aux1= a1[a1.length-1];
        for(int i=(a1.length-2);i>=0;i--){
            a1[i+1] = a1[i];
            if(i==0){
                a1[0] = aux1;
            }
        }
        for(int k:a1) System.out.print(k + " ");
    }
}