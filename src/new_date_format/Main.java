/*

Problem : 
Convert the following date time format.
Input: 12/03/1999 14:30:3012 
Output: March 1999 2:30:30 PM

 */
package new_date_format;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        while (true) {
            
            System.out.println("Enter the String : ");
            String temp = sc.nextLine();
            
            String[] tempStr = temp.split(" ");
            
            String date = tempStr[0];
            String time = tempStr[1];

            String[] dateArray = date.split("/");
            String[] timeArray = time.split(":");

            String month = months[Integer.parseInt(dateArray[1]) - 1];
            String s = dateArray[0] + " " + month + " " + dateArray[2];

            String timePeriod = "AM";

            int val = Integer.parseInt(timeArray[0]);
            if (val / 12 >= 1) {
                timePeriod = "PM";
            }

            String timestr = (Integer.parseInt(timeArray[0]) % 12) + ":" + timeArray[1] + ":" + timeArray[2] + " " + timePeriod;

            System.out.println(s + " " + timestr);
            System.out.println();
        }
    }
}
