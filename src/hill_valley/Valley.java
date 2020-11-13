/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hill_valley;

/**
 *
 * @author Muzaffar
 */
public class Valley {

    public boolean checkValley(int arr[], int n) {

        boolean descending = false, flat = false, ascending = false;

        int i = 1;
        while (i < n && arr[i] < arr[i - 1]) {
            ++i;

            descending = true;
        }
        while (i < n && arr[i] == arr[i - 1]) {
            ++i;
            flat = true;
        }
        while (i < n && arr[i] > arr[i - 1]) {
            ++i;
            ascending = true;
        }
        return (i == n && descending && !flat && ascending);
    }

}
