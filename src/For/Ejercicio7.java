package For;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, r = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " Dame un numero: ");
            a = leer.nextInt();
            r = r + a;
        }
        System.out.println("La suma total es: " + r);
    }

}
