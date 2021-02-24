package For;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, r = 0, contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Dame un sueldo: ");
            a = leer.nextInt();
            r = r + a;
            if (a >= 1000) {
                contador++;
            }
        }
        System.out.println("La suma es: " + r);
        System.out.println(contador + " Son mayores de mil");
    }

}
