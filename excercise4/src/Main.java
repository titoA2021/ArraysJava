import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Read 10 integer number, shows them in the following order:
        first one, last one, second one, penultimate, third one, and so on...
         */

        int numbers[] = new int[10];
        Scanner e = new Scanner(System.in);

        for(int i=0;i < numbers.length;i++){
            System.out.println("Type number " + (i+1) + " : ");
            numbers[i]=e.nextInt();
        }

        for(int i=0;i <= Math.round(numbers.length/2);i++){
            System.out.println(numbers[i]);
            System.out.println(numbers[numbers.length-(i+1)]);
        }

    }
}