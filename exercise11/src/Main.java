import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ask for 5 creasing numbers, saves them in a 10-index array. Read N number and
         */
        int[] a1 = new int[10];
        boolean flag = true;
        int num;
        int index =0, j=0;
        Scanner e = new Scanner(System.in);
        do{
            for (int i = 0; i < 5; i++) {
                System.out.println("type a number: ");
                a1[i]=e.nextInt();
            }
            for(int i=0;i<4;i++){
                if(a1[i]<a1[i+1]){
                    flag = true;
                }
                if(a1[i]>a1[i+1]){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                System.out.println("The vector is not ordered in increasing order");
            }
        }while (!flag);

        System.out.println("Type other number to insert");
        num = e.nextInt();

        while(a1[j]< num && j<5){
            index++;
            j++;
        }

        for(int i=4;i>=index;i--){
            a1[i+1]= a1[i];
        }

        a1[index] = num;

        for(int k:a1) System.out.print(k + " ");


    }
}
