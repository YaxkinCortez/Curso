package EjerciciosExtendidos;
//1.- Programa que lea 3 números y los escriba ordenados de forma ascendente.

import java.util.Scanner;

public class EjercicioEx1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un numero: ");
        b = leer.nextInt();
        System.out.print("Dame un numero: ");
        c = leer.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }

}
