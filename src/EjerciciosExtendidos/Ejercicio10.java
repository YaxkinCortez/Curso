package EjerciciosExtendidos;

import java.util.Scanner;

/*
10.- Dado un número entero positivo N, escribe un programa que determine cuántos
dígitos se necesitan para escribir el valor N. Por ejemplo, 99 necesita 2 dígitos, 
115 necesita 3, para 1000 la salida es 4.
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Dame un numero: ");
        n = leer.nextInt();

        if (n < 10) {
            System.out.println("UNA CIFRA");
        } else if (n < 100) {
            System.out.println("DOS CIFRAS");
        } else if (n < 1000) {
            System.out.println("TRES CIFRAS");

        } else if (n < 10000) {
            System.out.println("CUATRO CIFRAS");
        }
    }

}
