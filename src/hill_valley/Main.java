package hill_valley;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        
        The Program checks for a Hill and a Valley
                .
              .    .
            .         . 
           .            .  
         .                .
        .                   . 
        
        */
        CheckHillValley chv = new CheckHillValley();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the size of the array : ");
            int sizeOfArray = sc.nextInt();
            System.out.println("Enter " + sizeOfArray + " elements : ");
            int i;
            int[] HillArray;
            HillArray = new int[sizeOfArray];
            for (i = 0; i < sizeOfArray; i++) {
                HillArray[i] = sc.nextInt();
            }

            System.out.println(chv.hillValley(HillArray));
            System.out.println();
        }
        
    }

}
