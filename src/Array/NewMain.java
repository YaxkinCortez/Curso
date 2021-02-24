/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author yaxkin-pc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*int t[][]; // definimos t como una tabla bidimensional
        t = new int[5][5]; // creamos la tabla de 5x5
        t[0][0] = 1;
        t[0][1] = 2;
        t[0][2] = 3;
        t[0][3] = 4;
        t[0][4] = 5;

        t[1][0] = 6;
        t[1][1] = 7;
        t[1][2] = 8;
        t[1][3] = 9;
        t[1][4] = 10;

        t[2][0] = 11;
        t[2][1] = 12;
        t[2][2] = 13;
        t[2][3] = 14;
        t[2][4] = 15;

        t[3][0] = 16;
        t[3][1] = 17;
        t[3][2] = 18;
        t[3][3] = 19;
        t[3][4] = 20;

        t[4][0] = 21;
        t[4][1] = 22;
        t[4][2] = 23;
        t[4][3] = 24;
        t[4][4] = 25;*/

 /*int t[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };*/
        int a, b;
        /*System.out.print("Dame el valor de la dimension A: ");
        a = leer.nextInt();
        System.out.print("Dame el valor de la dimension A: ");
        b = leer.nextInt();*/
        a = 5;
        b = 5;

        int t[][] = new int[a][b];

        //ahora los llenamos
        for (int i = 0; i < a; i++) {//filas
            for (int j = 0; j < b; j++) {//columnas
                System.out.print("Dame el valor: ");
                t[i][j] = i + j;//leer.nextInt();
                //i es igual a N
                //j es igual a M
                //entonces hacemos la funcion de N+M(i+j)

            }
        }

        for (int i = 0; i < t.length; i++) {//filas
            System.out.println();
            for (int j = 0; j < t.length; j++) {//columnas
                System.out.print(t[i][j] + " ");
            }
        }
    }
}
