import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Read 5 numbers, saves it in an array and shows it in inverse orden
         */
        Scanner e = new Scanner(System.in);
        int[] num = new int[5];

        for(int i=0;i<num.length;i++){
            System.out.println("Digit the number " + (i+1) + " : ");
            num[i] = e.nextInt();
        }
        for(int i=(num.length-1);i>=0;i--){
            System.out.println("index: " + i + " -- " + "number: " + num[i]);
        }
    }
}