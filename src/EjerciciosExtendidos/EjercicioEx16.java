package EjerciciosExtendidos;

import java.util.Scanner;

/*
16.- Escribe un programa que lea un número e imprime un triángulo de números de
la forma siguiente. Si el número leído es 4, imprimirá:
1
12
123
1234

 */
public class EjercicioEx16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i = 0, r = 1;
        System.out.print("Dame un numero: ");
        n = leer.nextInt();
        int a = 1;
        while (a <= n) {

            for (i = 1; i <= a; i++) {
                System.out.print(i);
            }
            System.out.println();
            a++;
        }
    }

}
