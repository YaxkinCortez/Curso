package Array;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n;
        System.out.print("Dame el numero de alumnos: ");
        n = l.nextInt();
        int[] an = new int[n];
        String[] a = new String[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Dame el nombre del alumno: ");
            a[i] = l.nextLine();
        }

        for (int i = 0; i < an.length; i++) {
            System.out.print("Calificacion del alumno " + a[i] + ": ");
            an[i] = l.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("La calificacion de " + a[i] + " es: " + an[i]);
        }
    }

}
