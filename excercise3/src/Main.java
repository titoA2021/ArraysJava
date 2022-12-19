import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Read 5 numbers in an array, calculate the average of
        negative and positive numbers, also calculate the total of 0s
         */

        Scanner e = new Scanner((System.in));

        float num[] = new float[5];
        int contNeg=0, contPos=0, cont0=0;
        float avP, avN,sumP=0, sumN=0;
        for (int i=0;i<num.length;i++){
            System.out.println("Type number " + i + " : ");
            num[i] = e.nextInt();
            if (num[i] < 0){
                sumN += num[i];
                contNeg ++;
            } else if (num[i] > 0) {
                sumP+=num[i];
                contPos ++;
            } else if (num[i] == 0) {
                cont0 ++;
            }
        }
        avP = sumP/contPos;
        avN = sumN/contNeg;
        System.out.println("NegN: " + contNeg + " PosN: " + contPos + " 0sN: " + cont0);
        System.out.println("Length: " + num.length);
        System.out.println("AvgNeg: " + avN + " AvgPos: " + avP);

    }
}