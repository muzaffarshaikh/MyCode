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
public class Hill {

    public boolean checkHill(int arr[], int n) {

        boolean ascending = false, flat = false, descending = false;

        int i = 1;
        while (i < n && arr[i] > arr[i - 1]) {
            ++i;

            ascending = true;
        }
        while (i < n && arr[i] == arr[i - 1]) {
            ++i;
            flat = true;
        }
        while (i < n && arr[i] < arr[i - 1]) {
            ++i;

            descending = true;
        }
        return (i == n && ascending && !flat && descending);
    }

}
