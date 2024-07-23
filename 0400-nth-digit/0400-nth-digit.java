
public class Solution {

    // Calculates the total number of digits from 1 to n
    public static long get(int n) {
        long count = 0;
        int digits = 1;
        long start = 1;
        
        while (n >= start * 10) {
            count += 9 * start * digits;
            digits++;
            start *= 10;
        }
        count += (n - start + 1) * digits;
        return count;
    }
    
    // Finds the nth digit in the infinite sequence
    public  int findNthDigit(int n) {
        int s = 1;
        int e = Integer.MAX_VALUE;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (get(mid) < n) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        String sNum = Integer.toString(s);
        long totalDigits = get(s);
        long diff = totalDigits - n;
        return sNum.charAt(sNum.length() - 1 - (int) diff) - '0';
    }

    
}
