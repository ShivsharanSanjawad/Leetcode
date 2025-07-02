class Solution {
    long mod = 1000000007;

    public int possibleStringCount(String s, int k) {
        ArrayList<Integer> freq = new ArrayList<>();
        int count = 1;

        // Step 1: Create frequency blocks
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            else {
                freq.add(count);
                count = 1;
            }
        }
        freq.add(count);
        int n = freq.size();

        // Step 2: Compute total product = 1 char per group
        long totalProduct = 1;
        for (int f : freq) {
            totalProduct = (totalProduct * f) % mod;
        }

        if (n >= k) return (int) totalProduct;

        // Step 3: Optimized DP using sliding window
        long[][] dp = new long[n][k];
        for (int i = 1; i <= freq.get(0) && i < k; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            int maxTake = freq.get(i);
            long[] prefix = new long[k];
            prefix[0] = dp[i - 1][0];
            for (int j = 1; j < k; j++) {
                prefix[j] = (prefix[j - 1] + dp[i - 1][j]) % mod;
            }

            for (int j = 1; j < k; j++) {
                long left = j - maxTake - 1 >= 0 ? prefix[j - maxTake - 1] : 0;
                dp[i][j] = (prefix[j - 1] - left + mod) % mod;
            }
        }

        // Step 4: Subtract bad cases (strings < k length)
        long bad = 0;
        for (int len = 1; len < k; len++) {
            bad = (bad + dp[n - 1][len]) % mod;
        }

        return (int) ((totalProduct - bad + mod) % mod);
    }
}
