import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
}
