package phone_number_sort;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class PhoneNumberSort {

    /**
     *
     * @param arr
     */
    public void sortPhoneNumber(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        PhoneNumberSort phone = new PhoneNumberSort();

        Scanner sc = new Scanner(System.in);
        while(true) {
            
        
        System.out.println("Enter the phone number : ");
        String phoneNumber = sc.next();
        String[] tempStr = phoneNumber.split("");
        int i;
        int[] arr;
        arr = new int[tempStr.length];
        for (i = 0; i < tempStr.length; i++) {
            int integer = Integer.parseInt(tempStr[i]);
            arr[i] = integer;
        }
        phone.sortPhoneNumber(arr);

        int len = arr.length;
        System.out.println("The sorted number is : ");
        for (i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        }
    }

}
