package EjerciciosExtendidos;

import java.util.Scanner;

/*
Algoritmo que diga si un número entero positivo es primo o no (se va dividiendo por
2, 3, 5, 7....... hasta N-1). Si ninguna de las divisiones es exacta y llegamos a una en la
que el cociente es menor o igual que el divisor, el nº es primo.
 */
public class EjercicioEx9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, i, c = 0;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();

        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        if (c <= 2) {
            System.out.println("Es primo");
        } else if(c >=3) {
            System.out.println("Es compuesto");
        }else{
            System.out.println("No es primo, ni compuesto");
        }
    }

}
