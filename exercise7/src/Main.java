import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int a[] = new int[10];
        boolean increase = false, decrease = false;

        System.out.println("Type the array: ");
        for (int i=0;i<a.length;i++){
            System.out.println("Type number " + (i+1) + " : ");
            a[i] = e.nextInt();
        }
        int z=0;
        for(int i=0; i< (a.length-1);i++){
            if(a[i]>a[i+1]){
                decrease = true;
            } else if (a[i]<a[i+1]) {
                increase = true;
            }
        }

        if((decrease==true) && (increase==false)){
            System.out.println("\nDecreasing");
        } else if ((decrease==false) && (increase==true)) {
            System.out.println("\nIncreasing");
        } else if ((decrease==true) && (increase)) {
            System.out.println("\nDisorganised");
        } else if ((!decrease) && (!increase)) {
            System.out.println("\nEquals");
        }
    }
}