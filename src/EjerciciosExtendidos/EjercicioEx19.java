package EjerciciosExtendidos;

import java.util.Scanner;

public class EjercicioEx19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c = 0;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un numero: ");
        b = leer.nextInt();
        while (a != 0) {
            if (a % 2 != 0) {
                c = c + b;
            }
            a /= 2;
            b *= 2;
        }
        System.out.println("El resultado es: "+c);
    }

}
