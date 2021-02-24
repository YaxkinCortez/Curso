package IfElse;

import java.util.Scanner;

/**
 * pedir un numero entre 0 y 9,999 y decir si es capicua(un numero que se lee
 * igual al derecho y al reves)
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dm, um, c, d, u, num;

        System.out.print("Ingrese un numero: ");
        num = leer.nextInt();

        while (num > 0) {
            //unidades
            u = num % 10;
            num = num / 10;
            //decenas
            d = num % 10;
            num = num / 10;
            //centenas
            c = num % 10;
            num = num / 10;
            //unidades de millar
            um = num % 10;
            num = num / 10;
            //decenas de millar
            dm = num;

            if (u == dm && d == um) {
                System.out.println("Si es capicua");
            } else if (u == um && d == c) {
                System.out.println("Si es capicua");
            } else if (u == c) {
                System.out.println("Si es capicua");
            } else if (u == d) {
                System.out.println("Si es capicua");
            } else {
                System.out.println("No es capicua");
            }
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
        }
    }
}
