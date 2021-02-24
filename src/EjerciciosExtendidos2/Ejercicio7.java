package EjerciciosExtendidos2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio7 {

    Scanner leer = new Scanner(System.in);

    public void menuEjercicio7() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 1\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion7(a);
    }

    private void menuEjecucion7(int a) {
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
        int po[] = new int[10];

        for (int i = 0; i < po.length; i++) {
            System.out.print((i + 1) + ".- Dame el numero:");
            po[i] = leer.nextInt();
        }

        Arrays.sort(po);

        for (int i = 0; i < po.length; i++) {
            System.out.println(po[i]);
        }
    }
}
