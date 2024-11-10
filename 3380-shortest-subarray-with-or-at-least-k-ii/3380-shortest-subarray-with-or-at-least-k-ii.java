class Solution {
    int[] a;
    // int[] b;
    int x ;

    public void add(int n) {
        for (int i = 0;i< a.length; i++) {
            a[i] += (n & 1);
            n >>= 1;
        }
    }
    public void remove(int n) {
        for (int i = 0; i<a.length; i++) {
            a[i] -= (n & 1);
            n >>= 1;
        }
    }

    public void set(int k) {
        // int i = 0;
        // while (k > 0) {
        //     b[i++] = (k & 1);
        //     k >>= 1;
        // }
        this.x = k ;
    }

    public boolean isok() {
        // for (int i = 0; i < a.length; i++) {
        //     if (b[i] > a[i]) {
        //         return false;
        //     }
        // }
        // return true;
        int z = 0 ;
        for(int i =0 ; i<a.length ; i++){
            if(a[i]>0){
                z = z|(1<<i);
            }
        }
        return z>=x ;
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) {
            return 1;
        }
        a = new int[32];
        // b = new int[32];
        // set(k);
        set(k);

        int min = Integer.MAX_VALUE;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
            while (j <=i&& isok()) {
                min = Math.min(min, i - j + 1);
                remove(nums[j++]);
            }
           
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}