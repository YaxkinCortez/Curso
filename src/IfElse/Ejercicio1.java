package IfElse;

import java.util.Scanner;

/*
* pedir un numero entre 0 y 9,999 y decir cuantas cifras tiene
*/
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        System.out.print("Ingresa un numero: ");
        a = leer.nextInt();

        while (a > 0) {
            if (a < 10) {
                System.out.println("Una cifra");
            } else if (a < 100) {
                System.out.println("Dos cifra");
            } else if (a < 1000) {
                System.out.println("Tres cifra");
            } else if (a < 10000) {
                System.out.println("Cuatro cifra");
            }
            System.out.print("Ingresa un numero: ");
            a = leer.nextInt();
        }
    }

}
