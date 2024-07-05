import java.util.Arrays;
import java.math.*;

class Solution {
    public  int[] divisibilityArray(String word, int m) {
        long startTime = System.currentTimeMillis();
        int a[] = new int[word.length()];
        BigInteger b = new BigInteger("0");
        BigInteger z = new BigInteger("0");
        for (int i = 0; i < word.length(); i++) {

            long elapsedTime = System.currentTimeMillis() - startTime;
            if (elapsedTime >= 1000) {

                return a;
            }
            b = new BigInteger(b.toString(10) + String.valueOf(word.charAt(i)));
            BigInteger[] result = b.divideAndRemainder(BigInteger.valueOf(m));
            if (result[1].equals(BigInteger.ZERO)) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }

        }
        return a;
    }
}