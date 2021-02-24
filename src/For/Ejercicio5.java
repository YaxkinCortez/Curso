package For;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        for (int a = 1; a <= 10; a++) {
            System.out.println("\nTABLA DEL "+a);
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
        }
    }
    
}
