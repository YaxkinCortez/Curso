package For;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fac;
        double r = 1;

        System.out.print("Dame un numero: ");
        fac = leer.nextInt();
        
        for (int i = fac; i > 0; i--) {
            r = r * i;
        }
        System.out.println("El factorial es: " + r);
    }

}
