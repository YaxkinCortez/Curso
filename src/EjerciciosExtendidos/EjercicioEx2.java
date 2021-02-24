package EjerciciosExtendidos;

import java.util.Scanner;

/*
2.- Programa que recibe como dato de entrada una hora expresada horas, minutos y
segundos y escribe la nueva hora transcurrido 1 segundo. Controlar el valor de las
entradas.
 */
public class EjercicioEx2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int t, h, m, s;
        System.out.print("Dame una hora: ");
        h = leer.nextInt();
        System.out.print("Dame los minutos: ");
        m = leer.nextInt();
        System.out.print("Dame los segundos: ");
        s = leer.nextInt();

        if (h >= 0 && h <= 23) {
            if (m >= 0 && m <= 60) {
                if (s >= 0 && s <= 60) {
                    s++;
                    if (s >= 60) {
                        s = 0;
                        m++;

                        if (m >= 60) {
                            m = 0;
                            h++;

                            if (h >= 24) {
                                h = 0;

                                System.out.println(h + ":" + m + ":" + s);
                            }
                        }
                    } else {
                        System.out.println(h + ":" + m + ":" + s);
                    }
                }
            }
        }
    }

}
