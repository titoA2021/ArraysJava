import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de n: "));

        char[] letras = new char[n];

        System.out.println("Digite los elementos del arreglo: ");

        for(int i=0;i<n;i++){
            System.out.println((i+1) + ". Digite un caracter");
            letras[i] = e.next().charAt(0);
        }

        System.out.println("\nLos elementos del arreglo son: ");
        for(int i=0;i<n;i++){
            System.out.print(letras[i] + " " );
        }
    }
}