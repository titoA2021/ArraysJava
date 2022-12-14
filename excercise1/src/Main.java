import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Read 5 numbers, stores it in an array and shows it in orden
        Scanner e = new Scanner(System.in);
        int[] num = new int[5];

        for(int i=0;i<num.length;i++){
            System.out.println("Digit the number " + (i+1) + " : ");
            num[i] = e.nextInt();
        }
        for(int j:num){
            System.out.println(j);
        }
    }
}