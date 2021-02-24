package EjerciciosExtendidos2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Ejercicio6 {

    Scanner leer = new Scanner(System.in);

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
    //int menor = array[0];

    private void ejecucion() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ".- Dame un numero: ");
            array[i] = leer.nextInt();
        }
        System.out.println();
        System.out.println("La media es: " + media(array));
        System.out.println("La moda es: " + moda(array));
        System.out.println("La mediana es: " + mediana(array));
        System.out.println("El numero mayor es: " + numeroMasAlto(array));
        System.out.println("El numero menor es: " + numeroMenor(array));
    }

    private float media(int[] array) {
        float media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        media /= 30;
        //System.out.println();
        //System.out.println("Media es: " + media);
        return media;
    }

    //moda
    private int moda(int[] array) {
        int moda = 0;
        int maxiRepite = 0;
        for (int i = 0; i < array.length; i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maxiRepite) {
                moda = array[i];
                maxiRepite = vecesQueSeRepite;
            }
        }
        return moda;
        //System.out.println("La moda es " + moda + " y se repitió " + maxiRepite + " veces.");
    }

    //mediana
    private int mediana(int[] array) {
        int mediana;
        Arrays.sort(array);
        int mitad = array.length / 2;
        if (array.length
                % 2 == 0) {
            mediana = (array[mitad - 1] + array[mitad]) / 2;
        } else {
            mediana = array[mitad];
        }
        //System.out.println("La mediana es: " + mediana);
        return mediana;
    }

    private int numeroMasAlto(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    private int numeroMenor(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}
