package EjerciciosExtendidos;

import java.util.Scanner;

/*
6.- Programa que calcula el producto de dos números enteros y positivos mediante
sumas sucesivas.
 */
public class EjercicioEx6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, r = 0;

        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un numero: ");
        b = leer.nextInt();
        if (a > 0 && b > 0) {
            for (int i = 1; i <= b; i++) {
                r += a;
            }
            System.out.println("El resultado es: " + r);
        } else {
            System.out.println("Los numeros tienen que ser positivos");
        }
    }

}
