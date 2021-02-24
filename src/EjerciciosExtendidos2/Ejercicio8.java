package EjerciciosExtendidos2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio8 {

    Scanner leer = new Scanner(System.in);

    public void menuEjercicio8() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 1\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion8(a);
    }

    private void menuEjecucion8(int a) {
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
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int tabla3[] = new int[20];
        int con = 0;
        System.out.println("Tabla 1");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".- Dame un numero: ");
            tabla1[i] = leer.nextInt();
        }
        System.out.println("Tabla 2");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".- Dame un numero: ");
            tabla2[i] = leer.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            tabla3[con] = tabla1[i];
            con++;
            tabla3[con] = tabla2[i];
            con++;
        }

        Arrays.sort(tabla3);
        System.out.println("Tabla 3 Ordenada");
        for (int i = 0; i < 20; i++) {
            System.out.println(tabla3[i]);
        }
    }
}
