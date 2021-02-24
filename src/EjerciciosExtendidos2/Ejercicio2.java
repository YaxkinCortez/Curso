package EjerciciosExtendidos2;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio2 {

    private Scanner leer = new Scanner(System.in);

    public void menuEjercicio2() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 2\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion2(a);
    }

    private void menuEjecucion2(int a) {
        if (a > 3) {
            System.out.println("Ingrese una opcion valida");
        } else {
            switch (a) {
                case 1:
                    ejecucion();
                case 2:
                    Menu me = new Menu();
                    me.menuPrincipal();

                case 3:
                    System.exit(0);
            }
        }
    }

    private void ejecucion() {
        int array[] = new int[50];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ".- Dame un numero: ");
            array[i] = leer.nextInt();
        }

        int conPar = 0;
        int conImpar = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                par += array[i];
                conPar++;
            } else {
                impar += array[i];
                conImpar++;
            }
        }

        System.out.println();
        System.out.println("La suma de PARES es: " + par);
        System.out.println("Hay " + conPar + " numeros PARES");
        System.out.println("La suma de IMPAR es: " + impar);
        System.out.println("Hay " + conImpar + " numeros IMPARES");
        System.out.println();
        menuEjercicio2();
    }
}
