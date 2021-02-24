package EjerciciosExtendidos2;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio1 {

    private Scanner leer = new Scanner(System.in);

    public void menuEjercicio1() {
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
        int array[] = new int[50];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ".- Dame un numero: ");
            array[i] = leer.nextInt();
        }

        int mayor = array[0];
        int menor = array[0];
        int conMayor = 0;
        int conMenor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            } else if (array[i] < menor) {
                menor = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (mayor == array[i]) {
                conMayor++;
            } else if (menor == array[i]) {
                conMenor++;
            }
        }
        System.out.println();
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero mayor se repite: " + conMayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero menor se repite: " + conMenor);
        System.out.println();
        menuEjercicio1();
    }
    
}
