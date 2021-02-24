package Principal;

import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, op = 0, altura = 1, contador = 0, i = 1;
        boolean v=false;
        System.out.print("Dame un numero: ");
        n = leer.nextInt();

        while (i <= n) {
            contador += i;
            if (contador == n) {
                v = true;
                op = i;

                if (v) {
                    while (altura <= op) {

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
                //System.out.println("No se puede generar un triangulo con este numero " + n);
            }
            i++;
        }
        if(v==false){
            System.out.println("No se puede generar un triangulo con este numero " + n);
        }
    }

}
