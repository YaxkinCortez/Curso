package Array;

/**
 *
 * @author yaxkin-pc
 */
public class NewMain1 {

    public static void main(String[] args) {
        int a[][] = {
            {15, 35, 14},
            {87, 2, 35},
            {7, 45, 50}
        };

        int b[][] = {
            {72, 75, 10},
            {12, 98, 12},
            {31, 81, 42}
        };
        
        int c[][]=new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        for (int i = 0; i < c.length; i++) {
            System.out.println();
             for (int j = 0; j < c.length; j++) {
                 System.out.print(c[i][j]+" ");
            }
        }
    }

}
