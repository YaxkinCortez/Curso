package EjerciciosExtendidos2;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Menu {

    Scanner leer = new Scanner(System.in);

    public void menuPrincipal() {
        menu();
    }

    private void menu() {
        int a;
        System.out.print("Menu Principal \n"
                + "1.- Ejercicio 1\n"
                + "2.- Ejercicio 2\n"
                + "3.- Ejercicio 3\n"
                + "4.- Ejercicio 4\n"
                + "5.- Ejercicio 5\n"
                + "6.- Ejercicio 6\n"
                + "7.- Ejercicio 7\n"
                + "8.- Ejercicio 8\n"
                + "9.- Salir\n"
                + "Tecle una opcion: ");
        a = leer.nextInt();
        switcH(a);
    }

    private void switcH(int a) {
        if (a > 9) {
            System.out.println("Ingrese un numero correcto");
            menu();
        } else {
            switch (a) {
                case 1:
                    Ejercicio1 ej1 = new Ejercicio1();
                    ej1.menuEjercicio1();
                case 2:
                    Ejercicio2 ej2 = new Ejercicio2();
                    ej2.menuEjercicio2();
                case 3:
                    Ejercicio3 ej3 = new Ejercicio3();
                    ej3.menuEjercicio3();

                case 4:
                    Ejercicio4 ej4 = new Ejercicio4();
                    ej4.menuEjercicio4();
                case 5:
                    Ejercicio5 ej5 = new Ejercicio5();
                    ej5.menuEjercicio5();
                case 6:
                    Ejercicio6 ej6=new Ejercicio6();
                    ej6.menuEjercicio1();
                case 7:
                    Ejercicio7 ej7 = new Ejercicio7();
                    ej7.menuEjercicio7();
                case 8:
                    Ejercicio8 ej8 = new Ejercicio8();
                    ej8.menuEjercicio8();
                case 9:
                    System.exit(0);
            }
        }
    }
}
