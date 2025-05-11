import java.util.HashMap;
import java.util.Map;
/// will fix later 
class Solution {
    private static final long MOD = 1_000_000_007;
    private long[][] comb;
    private long[][][][] memo;
    private int[] cnt;
    private int target, maxOdd, maxEven, n;

    public int countBalancedPermutations(String num) {
        n = num.length();
        cnt = new int[10];
        int tot = 0;

        for (char ch : num.toCharArray()) {
            int d = ch - '0';
            cnt[d]++;
            tot += d;
        }

        if (tot % 2 != 0) return 0;

        target = tot / 2;
        maxOdd = (n + 1) / 2;
        maxEven = n / 2;

        computeCombinations();
        // initialize memo array with sentinel -1
        memo = new long[11][target + 1][maxOdd + 1][maxEven + 1];
        for (int i = 0; i < 11; i++) {
            for (int s = 0; s <= target; s++) {
                for (int o = 0; o <= maxOdd; o++) {
                    for (int e = 0; e <= maxEven; e++) {
                        memo[i][s][o][e] = -1;
                    }
                }
            }
        }

        return (int) dp(0, target, maxOdd, maxEven);
    }

    private void computeCombinations() {
        comb = new long[maxOdd + 1][maxOdd + 1];
        for (int i = 0; i <= maxOdd; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }
    }

    private long dp(int digit, int sumLeft, int oddLeft, int evenLeft) {
        if (digit == 10) {
            return (sumLeft == 0 && oddLeft == 0 && evenLeft == 0) ? 1 : 0;
        }

        if (memo[digit][sumLeft][oddLeft][evenLeft] != -1) {
            return memo[digit][sumLeft][oddLeft][evenLeft];
        }

        long res = 0;
        int total = cnt[digit];
        for (int oddUse = 0; oddUse <= total; oddUse++) {
            int evenUse = total - oddUse;
            if (oddUse > oddLeft || evenUse > evenLeft || digit * oddUse > sumLeft) continue;

            long ways = (comb[oddLeft][oddUse] * comb[evenLeft][evenUse]) % MOD;
            long sub = dp(digit + 1, sumLeft - digit * oddUse, oddLeft - oddUse, evenLeft - evenUse);
            res = (res + ways * sub) % MOD;
        }

        memo[digit][sumLeft][oddLeft][evenLeft] = res;
        return res;
    }
}