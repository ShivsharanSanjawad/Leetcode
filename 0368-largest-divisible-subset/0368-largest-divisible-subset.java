import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> memo;

    public List<Integer> helper(int[] nums, int prevIndex, int currIndex) {
        if (currIndex == nums.length) {
            return new ArrayList<>();
        }

        int key = prevIndex * 1001 + currIndex; // 201 > max input size (to keep key unique)
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Option 1: Skip current element
        List<Integer> without = helper(nums, prevIndex, currIndex + 1);

        // Option 2: Take current element if divisible
        List<Integer> with = new ArrayList<>();
        if (prevIndex == -1 || nums[currIndex] % nums[prevIndex] == 0) {
            with.add(nums[currIndex]);
            with.addAll(helper(nums, currIndex, currIndex + 1));
        }

        List<Integer> res = with.size() > without.size() ? with : without;
        memo.put(key, res);
        return res;
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums); // always sort for this problem
        memo = new HashMap<>();
        return helper(nums, -1, 0); // start with no element picked
    }
}
