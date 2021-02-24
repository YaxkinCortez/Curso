package IfElse;

import java.util.Scanner;

public class FormulaGeneral {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        double a, b, c, x1, x2;

        System.out.print("Dame un numero: ");
        a = leer.nextDouble();
        System.out.print("Dame un numero: ");
        b = leer.nextDouble();
        System.out.print("Dame un numero: ");
        c = leer.nextDouble();

        if ((b * b) - (4 * a * c) > 0) {
            x1 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            x2 = (-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            System.out.println("Valor de X1: "+x1);
            System.out.println("Valor de X2: "+x2);
        }else{
            System.out.println("No tiene solucion");
        }
    }
    
}
