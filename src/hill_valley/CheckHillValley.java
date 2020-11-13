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
public class CheckHillValley {
    
    Hill hill = new Hill();
    Valley valley = new Valley();
    
    public boolean hillValley(int[] no) {
        int n = no.length;
        return hill.checkHill(no, n) || valley.checkValley(no, n);
    }
    
}
