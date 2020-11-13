package repeated_elements;

import java.util.Arrays;

/**
 *
 * @author Muzaffar
 */
public class Repeated {

    public boolean checkRepeated(String string) {

        char[] charArrayOfString;
        charArrayOfString = string.toCharArray();

        int charArrayLength = charArrayOfString.length;

        Arrays.sort(charArrayOfString);
        for (int i = 0; i < charArrayLength - 1; i++) {
            if (charArrayOfString[i] == charArrayOfString[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
