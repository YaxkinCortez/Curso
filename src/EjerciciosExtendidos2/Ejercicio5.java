/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtendidos2;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio5 {

    Scanner leer = new Scanner(System.in);

    public void menuEjercicio5() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 1\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion1(a);
    }

    private void menuEjecucion1(int a) {
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
        int matrix[][] = new int[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + "," + j + " Dame numero: ");
                matrix[i][j] = leer.nextInt();
            }
        }

        int mayor = matrix[0][0];
        int menor = matrix[0][0];
        int poMayor1 = 0, poMayor2 = 0;
        int poMenor1 = 0, poMenor2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                } else if (matrix[i][j] < menor) {
                    menor = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (mayor == matrix[i][j]) {
                    poMayor1 = i;
                    poMayor2 = j;
                } else if (menor == matrix[i][j]) {
                    poMenor1 = i;
                    poMenor2 = j;
                }
            }
        }
        System.out.println();
        System.out.println("El numero mayor es: " + mayor + " y esta en la posicion " + poMayor1 + "," + poMayor2);
        System.out.println("El numero menor es: " + menor + " y esta en la posicion " + poMenor1 + "," + poMenor2);
        menuEjercicio5();
    }
}
