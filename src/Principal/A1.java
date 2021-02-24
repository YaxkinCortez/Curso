
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el numero: ");
            n[i] = leer.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println(n[i]);
            System.out.println(n[9 - i]);
        }
    }
}
