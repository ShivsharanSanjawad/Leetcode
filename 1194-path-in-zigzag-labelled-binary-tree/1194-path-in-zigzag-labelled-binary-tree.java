import java.util.*;

class Solution {
    public int log2(int x) {
        return (int)(Math.log(x) / Math.log(2));
    }

    public int get(int x) {
        int n = log2(x);
        int pos;
        if (n % 2 == 1) {
            pos = (1 << (n + 1)) - x - 1;
        } else {
            pos = x - (1 << n);
        }
        if (n % 2 == 0) {
            pos = (1 << n) - pos - 1;
        }
        pos /= 2;
        
        return (1 << (n - 1)) + pos;
    }

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new LinkedList<>();
        while (label > 1) {
            ans.addFirst(label);
            label = get(label);
        }
        ans.addFirst(1);
        return ans;
    }
}
