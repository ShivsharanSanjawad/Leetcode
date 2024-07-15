class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> h = new HashMap<>();
    int[] result = new int[2];

 
    for (int i = 0; i < nums.length; i++) {
        h.put(nums[i], i);
    }

   
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (h.containsKey(complement) && h.get(complement) != i) {
            result[0] = i;
            result[1] = h.get(complement);
            break;
        }
    }

    return result;
    }
}