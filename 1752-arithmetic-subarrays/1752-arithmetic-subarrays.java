class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int x = l[i];
            int y = r[i];
            long max = Integer.MIN_VALUE;
            long min = Integer.MAX_VALUE;
            long sum = 0;
            long ssum = 0;

            for (int j = x; j <= y; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
                if (nums[j] < min) {
                    min = nums[j];
                }
                sum += nums[j];
                ssum += nums[j] * nums[j];
            }

            if (x == y) {
                ans.add(true);
                continue;
            }

            double z = (max - min) / (1.0 * (y - x));
            if (z != (int) z) {
                ans.add(false);
                continue;
            }

            long expectedSum = (long) ((min + max) * (y - x + 1)) / 2;
            long expectedSsum = 0;
            for (int j = 0; j <= (y - x); j++) {
                long term = min + j * (long) z;
                expectedSsum += term * term;
            }

            ans.add(expectedSum == sum && expectedSsum == ssum);
        }
        return ans;
    }
}
