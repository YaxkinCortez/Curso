/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfElse;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, u, d, c, um, dm;

        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        numero = leer.nextInt();

        u = numero % 10;
        numero = numero / 10;

        d = numero % 10;
        numero = numero / 10;

        c = numero % 10;
        numero = numero / 10;

        um = numero % 10;
        numero = numero / 10;

        dm = numero;

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
        } else {
            System.out.println(u + "" + d + "" + c + "" + um + "" + dm);
        }

    }
}
