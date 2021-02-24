package For;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, conCeros = 0, conPositivos = 0, conNegativos = 0, sumaPositivos = 0,
                sumaNegativos = 0;
        float mediaPositivos, mediaNegativos;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " DAME UN NUMERO: ");
            a = leer.nextInt();

            if (a == 0) {
                conCeros++;
            } else {
                if (a > 0) {
                    conPositivos++;
                    sumaPositivos += a;
                } else {
                    conNegativos++;
                    sumaNegativos += a;
                }
            }
        }
        System.out.println("Cantidad de ceros: " + conCeros);

        if (conPositivos == 0) {
            System.out.println("No hay positivos");
        } else {
            mediaPositivos = (float) sumaPositivos / conPositivos;
            System.out.println("La media de los positivos es: " + mediaPositivos);
        }

        if (conNegativos == 0) {
            System.out.println("No hay negativos");
        } else {
            mediaNegativos = (float) sumaNegativos / conNegativos;
            System.out.println("La media de los negativos es: " + mediaNegativos);
        }
    }

}
