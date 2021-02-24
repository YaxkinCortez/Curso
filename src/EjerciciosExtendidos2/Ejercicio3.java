package EjerciciosExtendidos2;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio3 {

    private Scanner leer = new Scanner(System.in);

    public void menuEjercicio3() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 1\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion3(a);
    }

    private void menuEjecucion3(int a) {
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
            array[i] = i + 1;
        }

        for (int i = 49; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println();
        menuEjercicio3();
    }
}
