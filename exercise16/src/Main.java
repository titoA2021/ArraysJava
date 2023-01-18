import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int[] g1=new int[5];
        int N;
        int first,second,third;
        float prom1=0.0f, prom2=0.0f, prom3=0.0f, promSt;

        for(int i=0;i<5;i++){
            System.out.println("Student " + (i+1) + " : ");
            for(int j=0;j<3;j++){
                switch (j){
                    case 0:
                        System.out.print((j+1) + " trimester: ");
                        first = e.nextInt();
                        System.out.println("--" + g1[i]);
                        g1[i] += first;
                        System.out.println("--" + g1[i]);
                        prom1 += first;
                        break;
                    case 1:
                        System.out.print((j+1) + " trimester: ");
                        second = e.nextInt();
                        System.out.println("--" + g1[i]);
                        g1[i] += second;
                        System.out.println("--" + g1[i]);
                        prom2 += second;
                        break;
                    case 2:
                        System.out.print((j+1) + " trimester: ");
                        third = e.nextInt();
                        System.out.println("--" + g1[i]);
                        g1[i] += third;
                        System.out.println("--" + g1[i]);
                        prom3 += third;
                        break;
                }
            }
        }
        for(int k: g1) System.out.print(k+" ");
        System.out.println("\nType the N-Student to find: ");
        N = e.nextInt();
        promSt = ((float) g1[N-1])/3;
        System.out.println("\nFirst trimester average: " + (prom1/g1.length));
        System.out.println("Second trimester average: " + (prom2/g1.length));
        System.out.println("Third trimester average: " + (prom3/g1.length));
        System.out.println("\nThe average for the " + N + " student is: " + promSt);
    }
}