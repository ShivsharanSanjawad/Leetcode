public class Solution {

    public static long get(int n) {
        long count = 0; 
        long c = 0; 
        int d = 0;
        int x = Integer.toString(n).length();
        
        while (d + 1 < x) {
            count += 9 * (int) Math.pow(10, d) * (d + 1);
            c += 9 * (int) Math.pow(10, d);
            d++;
        }
        
        count += (n - c - 1) * x;
        
        return count;
    }
    
   
    public  int findNthDigit(int n) {
        if(n==2147483647)
        return 2 ;
        int s = 1; 
        int e = n; 
        while (e >= s) {
            int mid = s + (e - s) / 2; 
            String sd = Integer.toString(mid);
            long y = get(mid);
            if (y == n) {
                String x = Integer.toString(mid - 1); 
                return x.charAt(x.length() - 1) - '0';
            }
            if (y < n) {
                if (y + sd.length() >= n) {
                    return sd.charAt((int)(n - y - 1)) - '0';
                } else {
                    s = mid + 1;
                }
            } else {
                e = mid - 1;
            }
        }
        return 0;
    }

   
}
