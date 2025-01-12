class Solution {
    public int totalHammingDistance(int[] nums) {
        int zero[] = new int[32] ; 
        int one[] = new int[32] ; 
        for(int i =0 ; i<nums.length;i++){
            int temp = nums[i] ; 
            for(int j= 0 ; j<32;j++){
                int x = temp&1 ;
                if(x==1){
                    one[j]++;
                }else zero[j]++;
                temp>>=1 ; 
            }
        }
        // System.out.println(Arrays.toString(one));
        // System.out.println(Arrays.toString(zero));
        int ans = 0 ; 
        for(int i = 0 ;i<32;i++){
            ans +=one[i]*zero[i] ;
        }
        return ans;
    }
}