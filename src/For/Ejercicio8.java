package For;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
