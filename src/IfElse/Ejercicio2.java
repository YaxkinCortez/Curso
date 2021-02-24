package IfElse;

import java.util.Scanner;

/*
* pedir un numero entre 0 y 9,999 y mostrarlo con las cifras al reves
* (decenas de millar, unidades de millar, centenas, decenas, unidades)
*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dm, um, c, d, u, num;

        System.out.print("Ingrese un numero: ");
        num = leer.nextInt();

        while (num > 0) {
            //unidades
            u = num % 10;
            num = num / 10;
            //decenas
            d = num % 10;
            num = num / 10;
            //centenas
            c = num % 10;
            num = num / 10;
            //unidades de millar
            um = num % 10;
            num = num / 10;
            //decenas de millar
            dm = num;

            //forma 1 para mostrar mensaje agregando numeros si no se cumplen las condiciones
            //System.out.println(u + "" + d + "" + c + "" + um + "" + dm);
            //forma 2 condicionando que ningun valor venga en forma de 0 
            if (dm == 0) {
                if (um == 0) {
                    if (c == 0) {
                        if (d == 0) {
                            System.out.println(u);
                        } else {
                            System.out.println(u + "" + d);
                        }
                    } else {
                        System.out.println(u + "" + d + "" + c);
                    }
                } else {
                    System.out.println(u + "" + d + "" + c + "" + um);
                }
            }    else {
                System.out.println(u + "" + d + "" + c + "" + um + "" + dm);
            }
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
        }

    }
}
