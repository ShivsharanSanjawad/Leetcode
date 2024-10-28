class Solution {
    public int longestSquareStreak(int[] nums) {
        boolean ans[] = new boolean[100001] ; 
        for(int i = 0 ; i<nums.length;i++){
            ans[nums[i]] = true ;
        }
        int max = -1;
        int check[] = new int[5];
        for(int i =1 ;i<317 ;i++){
            check[0] = i ;
            if(ans[i]){
                int curr = 1 ;
            for(int j = 1 ;j<5;j++){
                check[j] = check[j-1]*check[j-1];
                if(check[j]>0&&check[j]<=100000){
                    if(ans[check[j]])
                        curr = j+1 ;
                    else break ;
                }
            }
            max = Math.max(curr,max);
            }
        }
        return max>1?max:-1;
    }
}