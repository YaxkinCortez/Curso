package EjerciciosExtendidos;

import java.util.Scanner;

/*
3.- Programa que lee un nº de notas con valores de 0 a 10, que termina con el valor –1,
y nos dice si hubo o no alguna con el valor 10.
 */
public class EjercicioEx3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, con = 0;

        System.out.print("Dame un numero: ");
        n = leer.nextInt();

        while (n > 0) {
            if (n >= 10) {
                con++;
            }
            System.out.print("Dame un numero: ");
            n = leer.nextInt();
        }
        if (con > 0) {
            System.out.println("Hubo: " + con);
        } else {
            System.out.println("No hay numeros");
        }
    }

}
