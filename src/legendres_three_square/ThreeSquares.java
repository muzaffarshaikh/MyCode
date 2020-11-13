package legendres_three_square;

/**
 *
 * @author Muzaffar
 */
public class ThreeSquares {

    /**
     *
     * @param n
     * @return
     */
    public boolean threeSquares(int n) {
        for (int i = 1; i * i <= n; i++) {
            for (int j = 1; j * j <= n; j++) {
                for (int k = 1; k * k <= n; k++) {
                    if (i * i + j * j + k * k == n) {
                        System.out.println(i + "² + " + j + "² + " + k + "² = " + n);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
