
package EjerciciosExtendidos;

import java.util.Scanner;

/*
Dado un número natural N, se calcula la raíz digital de N sumando los dígitos que
lo componen. El proceso se repite sobre el nuevo número hasta que el resultado
obtenido tiene un sólo dígito. Este último número es la raíz digital del número N.
Ejemplo: 347 􀃆3 + 4 + 7 = 14 􀃆 1 + 4 􀃆 5 􀃆 Raíz digital (347) = 5.
Escribir un programa C que calcule la raíz digital de un número.
*/
public class EjercicioEx18 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,c=0,r=0,t=0;
        System.out.print("Dame un numero: ");
        n=leer.nextInt();
        
        while(n>0){
            r+=(n%10);
            n/=10;
        }
    }
    
}
