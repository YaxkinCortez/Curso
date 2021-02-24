package EjerciciosExtendidos;

import java.util.Scanner;

/*
11.- Un número natural se denomina perfecto cuando es igual a la suma de todos sus
divisores, primos o no excepto él mismo. Por ejemplo 128 = 1 + 2 + 4 + 7 + 14. Escribe
un programa que averigüe si un número natural positivo es perfecto o no.
 */
public class EjercicioEx11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, i, c = 0;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();

        for (i = 1; i < a; i++) {
            if (a % i == 0) {
                c += i;
            }
        }
        if (c == a) {
            System.out.println("Perfecto, su respuesta es: " + c);
        } else {
            System.out.println("No perfecto, su respuesta es: " + c);
        }
    }

}
