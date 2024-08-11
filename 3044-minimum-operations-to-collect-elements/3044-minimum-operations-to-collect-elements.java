import java.util.List;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int x = 0; 
        int z = nums.size() - 1; 
        int count = 0;
        boolean[] a = new boolean[k + 1];

        while (z >= 0) {
            if (x == k) {
                return count;
            }

            int num = nums.get(z--);
            if (num <= k && !a[num]) {
                a[num] = true;
                x++;
            }

            count++;
        }
        return count;
    }
}
