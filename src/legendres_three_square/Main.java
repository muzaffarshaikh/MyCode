package legendres_three_square;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {

    public static void main(String args[]) {

        ThreeSquares ts = new ThreeSquares();

        Scanner sc = new Scanner(System.in);
        
        while (true) {

            System.out.println("Enter a number to check Legendre's three-square theorem : ");
            int n = sc.nextInt();
            if (ts.threeSquares(n) == true) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }

}
