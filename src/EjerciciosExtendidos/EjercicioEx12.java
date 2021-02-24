package EjerciciosExtendidos;

import java.util.Scanner;

/*
Escribe un programa que lea como dato de entrada una fecha expresada en días (1-31),
mes (1-12) y año (en N) y nos dice la fecha que será al día siguiente. 
Se supone que febrero siempre tiene 28 días.
 */
public class EjercicioEx12 {

    //meses con 31 dias= enero(1),marzo(3),mayo(5),julio(7),agosto(8),octubre(10),diciembre(12)
    //meses con 30 dias = abril(4),junio(6),septiembre(9),noviembre(11)
    //mes con 28 o 29 dias = febrero(2)
    public static void main(String[] args) {
        Peticion();
    }

    /* private static void Peticion() {
        Scanner leer = new Scanner(System.in);
        int d, m, a;
        System.out.print("Dame un dia: ");
        d = leer.nextInt();
        System.out.print("Dame un mes: ");
        m = leer.nextInt();
        System.out.print("Dame un año: ");
        a = leer.nextInt();

        Switch(d, m, a);
    }*/
    private static void Switch(int d, int m, int a) {
        //comparamos primero que las fechas coincidan los dias con el mes
        switch (m) {
            case 1:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 2:
                if (d > 0 && d <= 28) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 3:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 4:
                if (d > 0 && d <= 30) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 5:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 6:
                if (d > 0 && d <= 30) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 7:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 8:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 9:
                if (d > 0 && d <= 30) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 10:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                }
            case 11:
                if (d > 0 && d <= 30) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
            case 12:
                if (d > 0 && d <= 31) {
                    DiaMesAno(d, m, a);
                } else {
                    System.out.println("Fecha incorrecta los dias no coinciden con el mes\n");
                    Peticion();
                }
        }
    }
    //comenzamos con el mes seleccionado para verificar si aun hay dias dentro de el, sino saltamos al otro mes

    private static void DiaMesAno(int d, int m, int a) {
        d++;
        if (m == 1) {
            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x1 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 2) {

            if (d <= 28) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x2 " + (d - 28) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 3) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x3 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 4) {

            if (d <= 30) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x4 " + (d - 30) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 5) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x5 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 6) {

            if (d <= 30) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x6 " + (d - 30) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 7) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x7 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 8) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x8 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 9) {

            if (d <= 30) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x9 " + (d - 30) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 10) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x10 " + (d - 31) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 11) {

            if (d <= 30) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                System.out.println("La fecha es: x11 " + (d - 30) + "/" + m + "/" + a + "\n");
                Peticion();
            }
        } else if (m == 12) {

            if (d <= 31) {
                System.out.println("La fecha es: " + (d) + "/" + m + "/" + a + "\n");
                Peticion();
            } else {
                m++;
                a++;
                System.out.println("La fecha es: x12 " + (d - 31) + "/" + (m - 12) + "/" + a + "\n");
                Peticion();
            }
        }
        //para años bisiestos
        /*if(a%4==0 && a%100==0 && a%400==0){
            
        }*/
        
}
     private static void Peticion() {
        Scanner leer = new Scanner(System.in);
        int d, m, a;
        System.out.print("Dame un dia: ");
        d = leer.nextInt();
        System.out.print("Dame un mes: ");
        m = leer.nextInt();
        System.out.print("Dame un año: ");
        a = leer.nextInt();

        Switch(d, m, a);
    }
}
