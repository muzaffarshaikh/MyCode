/*

Draw the following pattern 
Example:
input: 4
output:   4            
         33          
        222        
       1111

 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int i, j;

        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (j < num - (i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print(num - i);
                }
            }
            System.out.println();

        }

    }

}
