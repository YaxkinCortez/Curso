package EjerciciosExtendidos;

import java.util.Scanner;

/*
15.- Programa que calcule el m.c.d. de dos números A y B (A>=B). Algoritmo:
1. Hacer dd = A y d = B.
2. Calcular q cociente entero de la división de dd por d y el resto r.
3. Si r != 0 hacer dd = d y d = r e ir al paso 1º. Si r = 0, d es el m.c.d.
 */
public class EjercicioEx14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un numero: ");
        b = leer.nextInt();
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("El MCD es: " + a);

    }

}
