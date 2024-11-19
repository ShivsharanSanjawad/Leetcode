class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);

            if (i - j + 1 > k) {
                int leftNum = nums[j];
                sum -= leftNum;
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                j++;
            }

            if (i - j + 1 == k && freqMap.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
