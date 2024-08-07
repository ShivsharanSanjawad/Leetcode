import java.util.*;

class Solution {
    public int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] c = new int[a.length + b.length];
        int x = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[x++] = a[i++];
            } else {
                c[x++] = b[j++];
            }
        }
        while (i < a.length) {
            c[x++] = a[i++];
        }
        while (j < b.length) {
            c[x++] = b[j++];
        }
        return c;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] merged = merge(nums1, nums2);
        
        ArrayList<Integer> a = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        
        for (int i = 0; i < merged.length; i++) {
            if ((i > 0 && merged[i] == merged[i - 1]) && merged[i] != prev) {
                if (Arrays.binarySearch(nums1, merged[i]) >= 0 && Arrays.binarySearch(nums2, merged[i]) >= 0) {
                    a.add(merged[i]);
                    prev = merged[i];
                }
            }
        }
        
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        
        return result;
    }

    
}
