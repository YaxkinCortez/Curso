package EjerciciosExtendidos;

import java.util.Scanner;

/*
15.- Programa que lea dos números N1 y N2 enteros positivos y obtiene su mínimo
común múltiplo.
 */
public class EjercicioEx15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, r1 = 0, r2 = 0;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un numero: ");
        b = leer.nextInt();
        for (int i = 1; r1 < 100; i++) {
            for (int x = 1; x < 100; x++) {
                r1 = a * i;
                r2 = b * x;
                if (r1 == r2) {
                    System.out.println(r2);
                }
            }
        }
    }

}
