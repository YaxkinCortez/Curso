package EjerciciosExtendidos2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio4 {

    Scanner leer = new Scanner(System.in);

    public void menuEjercicio4() {
        int a;
        System.out.println();
        System.out.print("Menu Ejercicio 1\n"
                + "1.- Ejecutar\n"
                + "2.- Menu Principal\n"
                + "3.- Salir\n"
                + "Teclee una opcion: ");
        a = leer.nextInt();
        menuEjecucion4(a);
    }

    private void menuEjecucion4(int a) {
        if (a > 3) {
            System.out.println("Ingrese una opcion valida");
        } else {
            switch (a) {
                case 1:
                    String numero;
                    System.out.print("Dame un numero de 10 digitos");
                    numero = leer.nextLine();

                    int num[] = converArray(numero, numero.length());

                    if (esCapicua(num)) {
                        System.out.println("Es capicua");
                    } else {
                        System.out.println("No es capicua");
                    }
                case 2:
                    Menu me = new Menu();
                    me.menuPrincipal();

                case 3:
                    System.exit(0);
            }
        }
    }

    private void ejecucion() {
        String numero;
        System.out.print("Dame un numero de 10 digitos");
        numero = leer.nextLine();

        int num[] = converArray(numero, numero.length());

        if (esCapicua(num)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

        /*System.out.println();
        menuEjercicio4();*/
    }

    private int[] converArray(String numero, int longi) {
        int[] numeros = new int[longi];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Character.getNumericValue(numero.charAt(i));
        }
        return numeros;
    }

    private boolean esCapicua(int[] lista) {
        int listaP[] = new int[lista.length];

        for (int i = 0, j = 1; j < listaP.length; i++, j++) {
            listaP[i] = lista[lista.length - j];
        }
        if (Arrays.equals(lista, listaP)) {
            return true;
        }
        return false;
    }
}
