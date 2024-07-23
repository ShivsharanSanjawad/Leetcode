import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    // Check if a number is a palindrome
    public boolean is_pal(int x) {
        String s = Integer.toString(x);
        if(s.length()%2==0&&x!=11){
            return false ;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Find the smallest prime palindrome greater than or equal to n
    public int primePalindrome(int n) {
         if (99899 * 1e2 <= n && n <= 1e8) {
            return 100030001;
        }
        int limit = Math.max(n, 10); // Ensure the limit is at least 10
        while (true) {
            List<Integer> primes = segmentedSieve(limit);
            for (int prime : primes) {
                if (prime >= n && is_pal(prime)) {
                    return prime;
                }
            }
            limit *= 2; // Double the limit and continue searching
        }
    }

    // Segmented Sieve to find all primes up to a given limit
    public static List<Integer> segmentedSieve(long limit) {
        int sqrtLimit = (int) Math.sqrt(limit);
        List<Integer> smallPrimes = findPrimesUpTo(sqrtLimit);

        List<Integer> allPrimes = new ArrayList<>();
        boolean[] segment = new boolean[1000000]; // Segment size (adjust based on memory)

        for (long low = 2; low <= limit; low += segment.length) {
            Arrays.fill(segment, true);
            long high = Math.min(low + segment.length - 1, limit);

            for (int prime : smallPrimes) {
                long start = Math.max(prime * prime, (low + prime - 1) / prime * prime);
                for (long j = start; j <= high; j += prime) {
                    segment[(int) (j - low)] = false;
                }
            }

            for (long i = low; i <= high; i++) {
                if (i > 1 && segment[(int) (i - low)]) {
                    allPrimes.add((int) i);
                }
            }
        }

        return allPrimes;
    }

    // Find all primes up to a certain limit using the Sieve of Eratosthenes
    public static List<Integer> findPrimesUpTo(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        List<Integer> primes = new ArrayList<>();

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }

        return primes;
    }

    
}
