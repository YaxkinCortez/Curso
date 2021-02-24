package EjerciciosExtendidos;

import java.util.Scanner;

/*
En el supermercado de la esquina colocan las latas de conservas apiladas
triangularmente. Esto trae bastantes problemas a la hora de hacer los pedidos, ya que
quieren un número de latas de manera que no sobre ni falte ninguna. Así, 6 latas se
pueden apilar triangularmente de la siguiente manera.
  *
 * *
* * *
Si tuvieran 7 latas, no podrían apilarse de forma triangular, ya que sobraría una.
Escribir un programa, que dado un número natural, compruebe si es adecuado para
montar pilas triangulares.
 */
public class EjercicioEx17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, op = 0, altura = 1, contador = 0, i = 1;
        boolean v;
        System.out.print("Dame un numero: ");
        n = leer.nextInt();

        while (i <= n) {
            contador += i;
            if (contador == n) {
                v = true;
                op = i;

                if (v) {
                    while (altura <= op) {
                        for (int blancos = 1; blancos <= n - altura; blancos++) {
                            System.out.print(" ");
                        }
                        for (int x = 1; x <= altura; x++) {
                            System.out.print("*");
                        }
                        System.out.println();
                        altura++;
                    }
                } else {
                    System.out.println("No se puede generar un triangulo con este numero " + n);
                }
            } else {
                v = false;
            }
            i++;
        }
    }
}
