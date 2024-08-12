import java.util.*;

class Solution {
    ArrayList<List<Integer>> ans = new ArrayList<>();
    
    public List<Integer> twosum(int[] nums, int sum, int x) {
        int e = nums.length - 1;
        ArrayList<Integer> re = null;
        
        while (x < e) {
            int temp = nums[x] + nums[e];
            if (temp == sum) {
                re = new ArrayList<>();
                re.add(nums[x]);
                re.add(nums[e]);
                re.add(-sum);
                ans.add(re);
                
                while (x < e && nums[x] == nums[x + 1]) x++;
                while (x < e && nums[e] == nums[e - 1]) e--;
                
                x++;
                e--;
            } else if (temp < sum) {
                x++;
            } else {
                e--;
            }
        }
        return re;
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            twosum(nums, 0 - nums[i], i + 1);
        }
        return ans;
    }
}
