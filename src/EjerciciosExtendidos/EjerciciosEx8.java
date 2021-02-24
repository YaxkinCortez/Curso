package EjerciciosExtendidos;

import java.util.Scanner;

/*
8.- Programa que dado dos intervalos cerrados [a, b] y [c, d] de la recta real devuelve la
intersección de ambos intervalos.(no usando matrices)
 */
public class EjerciciosEx8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Dame un valor del vector 1 (A): ");
        a = leer.nextInt();
        System.out.print("Dame un valor del vector 1 (B): ");
        b = leer.nextInt();
        System.out.print("Dame un valor del vector 2 (C): ");
        c = leer.nextInt();
        System.out.print("Dame un valor del vector 2 (D): ");
        d = leer.nextInt();

        if (a <= c && b >= d) {
            System.out.println("La intercepcion es: [" + a + "," + b + "]");
        } else if (a <= c && d >= b) {
            System.out.println("La intercepcion es: [" + a + "," + d + "]");
        } else if (c <= a && b >= d) {
            System.out.println("La intercepcion es: [" + c + "," + b + "]");
        } else if (c <= a && d >= b) {
            System.out.println("La intercepcion es: [" + c + "," + d + "]");
        }
    }

}
