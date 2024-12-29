class Solution {
    long MOD = 1000000007;

    public int numWays(String[] words, String target) {
        int m = words[0].length(); // Length of each word (number of columns)
        int n = words.length; // Number of words
        int tLen = target.length(); // Length of the target string

        // Frequency matrix: freq[i][ch] will store how many times char 'ch' appears in column i
        int[][] freq = new int[m][26];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                freq[i][words[j].charAt(i) - 'a']++;
            }
        }

        // DP table: dp[i][j] means the number of ways to form target[j:] starting from column i
        long[][] dp = new long[m + 1][tLen + 1];

        // Base case: If we have formed the entire target string, there's 1 way to do so.
        for (int i = 0; i <= m; i++) {
            dp[i][tLen] = 1;
        }

        // Fill the DP table from bottom-up
        for (int i = m - 1; i >= 0; i--) { // Iterate over columns from right to left
            for (int j = tLen - 1; j >= 0; j--) { // Iterate over target string from right to left
                int targetCharIndex = target.charAt(j) - 'a'; // Get the index of target[j]
                
                // Calculate dp[i][j]
                dp[i][j] = dp[i + 1][j]; // Case when we don't use the current column
                dp[i][j] = (dp[i][j] + (freq[i][targetCharIndex] * dp[i + 1][j + 1]) % MOD) % MOD;
            }
        }

        // The result is stored in dp[0][0], i.e., the number of ways to form the entire target starting from the first column
        return (int) dp[0][0];
    }
}
