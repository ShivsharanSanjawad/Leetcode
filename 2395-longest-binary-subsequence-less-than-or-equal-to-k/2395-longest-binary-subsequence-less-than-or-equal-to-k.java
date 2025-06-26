class Solution {
    public int longestSubsequence(String s, int k) {
        int sure = get(k) - 1;  // index of the highest bit in k
        
        // run twice: 
        //   version A: skip bits strictly > sure
        //   version B: skip bits >= sure
        int allowSure   = runWithRule(s, k, sure, /*excludeSureBit=*/ false);
        int forbidSure  = runWithRule(s, k, sure, /*excludeSureBit=*/ true);

        return Math.max(allowSure, forbidSure);
    }

    // returns the count under one of the two rules
    private int runWithRule(String s, int k, int sure, boolean excludeSureBit) {
        int count = 0;
        long total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                count++;
            } else {
                int x = (n - 1) - i;  // bit-position from right

                // choose guard based on rule
                if (excludeSureBit ? x >= sure : x > sure) 
                    continue;

                long add = 1L << x;
                if (total + add <= k) {
                    total += add;
                    count++;
                }
            }
        }
        return count;
    }

    // returns number of bits needed to represent k
    private int get(int k) {
        if (k < 2) return 1;
        return 1 + get(k >> 1);
    }
}
