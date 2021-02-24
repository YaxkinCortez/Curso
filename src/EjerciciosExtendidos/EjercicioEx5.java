package EjerciciosExtendidos;

import java.util.Scanner;

/*
5.- Programa que lee un nº entero X y otro nº entero positivo N y calcula la enésima
potencia de X.
 */
public class EjercicioEx5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, n;
        long r = 0;
        System.out.print("Dame un valor X: ");
        x = leer.nextInt();
        System.out.print("Dame un valor n: ");
        n = leer.nextInt();

        r = (long) Math.pow(x, n);

        System.out.println("El resultado es: " + r);
    }

}
