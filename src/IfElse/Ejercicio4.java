package IfElse;

import java.util.Scanner;

/**
 * pedir un año y decir si es bisiesto (son bisiestos los años multiplos de 4,
 * execpto los multiplos 100 que no sean que no sean multiplos de 400)
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        boolean ae;

        System.out.print("Dame un año: ");
        a = leer.nextInt();

       while (a > 0) {
            if (a % 4 == 0) {
                if (a % 100 == 0) {
                    if (a % 400 == 0) {
                        ae = true;
                    } else {
                        ae = false;
                    }
                } else {
                    ae = false;
                }
            } else {
                ae = false;
            }

            if (ae) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
            System.out.print("Dame un año: ");
            a = leer.nextInt();
        }
    }
}
