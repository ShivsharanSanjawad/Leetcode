class Solution {
    static final int MOD = 1_000_000_007; 
    static int pow(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = mul(res, a);
            a = mul(a, a);
            b >>= 1;
        }
        return res;
    }
    static int mul(int a, int b) {
        return (int) ((long) a * b % MOD);
    }
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums); 
        int l = 0 ; 
        int r = nums.length -1 ; 
        int sum = 0 ; 
        while(l<=r){
            int x = nums[l]+ nums[r] ; 
            if(x<=target){
                int y = r-l ; 
                sum = (sum + pow(2,y))%MOD ;
                l++ ;
            }else r-- ;
        }
        return sum;
    }
}