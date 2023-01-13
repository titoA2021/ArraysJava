import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Save 10 numbers in an array, ask for a position and delete the element leaving no
        blank space in between the elements
         */
        int[] a1={1,2,3,4,5,6,7,8,9,10};
        int[] a1aux=null;
        int index;
        int aux1=0;
        Scanner e = new Scanner(System.in);

        System.out.println("Type the position to delete the element: ");
        index = e.nextInt();

        for(int i=0;i<a1.length-1;i++){
            if(a1[i] == index){
                aux1 = a1[i];
                a1aux = new int[a1.length-1];
                for(int j=0;j<i;j++){
                    a1aux[j] = a1[j];
                }
                System.arraycopy(a1, i + 1, a1aux, i, a1.length - 1 - i);
            }
        }
        System.out.println("The original array:");
        for(int d:a1) System.out.print(d + " ");
        System.out.println("\nThe element deleted was: " + aux1);
        System.out.println("\nThe new array is: ");
        assert a1aux != null;
        for(int k:a1aux) System.out.print(k + " ");
    }
}