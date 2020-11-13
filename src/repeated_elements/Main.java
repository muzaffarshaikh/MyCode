/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeated_elements;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {
    
    //The Program checks if there are any repeated elements in the String
    
    public static void main(String[] args) {
        Repeated cr = new Repeated();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the String to check : ");
            String string = sc.next();
            if (cr.checkRepeated(string) == true) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
            System.out.println();
        }
    }
    
}
