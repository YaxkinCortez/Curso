package EjerciciosExtendidos;

import java.util.Scanner;

/*
7.- Programa que obtiene el cociente y el resto de dos números enteros y positivos
mediante restas sucesivas. A y B son las variables para leer datos de entrada (dividendo
y divisor), C es la variable para calcular el cociente. En A se guardará el resto. (Nota: La
división entre 0 no está definida).
 */
public class EjercicioEx7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c = 0, i;

        System.out.print("Dame un valor: ");
        a = leer.nextInt();
        System.out.print("Dame un valor: ");
        b = leer.nextInt();
        //forma con for
        for (i = 0; a >= b; i++) {
            a -= b;
        }
        //forma con while
        /*while (a >= b) {
            a -= b;
            c++;
        }*/
        //usando for
        System.out.println("Cociente: " + i);
        //usando while
        //System.out.println("Cociente: " + c);
        //para ambos el residuo
        System.out.println("Residuo: " + a);
    }

}
