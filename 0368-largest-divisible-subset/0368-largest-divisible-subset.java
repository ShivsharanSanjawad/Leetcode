class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<String, List<Integer>> memo = new HashMap<>();
        return dfs(nums, -1, 0, memo);
    }

    private List<Integer> dfs(int[] nums, int prevIdx, int currIdx, Map<String, List<Integer>> memo) {
        if (currIdx >= nums.length) return new ArrayList<>();

        String key = prevIdx + "," + currIdx;
        if (memo.containsKey(key)) return memo.get(key);

        // Option 1: Skip current
        List<Integer> notPick = dfs(nums, prevIdx, currIdx + 1, memo);

        // Option 2: Pick current if divisible
        List<Integer> pick = new ArrayList<>();
        if (prevIdx == -1 || nums[currIdx] % nums[prevIdx] == 0) {
            pick.add(nums[currIdx]);
            pick.addAll(dfs(nums, currIdx, currIdx + 1, memo));
        }

        // Choose longer subset
        List<Integer> result = (pick.size() > notPick.size()) ? pick : notPick;
        memo.put(key, result);
        return result;
    }
}
