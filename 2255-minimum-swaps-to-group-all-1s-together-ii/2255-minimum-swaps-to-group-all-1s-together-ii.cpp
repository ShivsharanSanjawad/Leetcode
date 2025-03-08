class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int one = 0 ;
        int zero = 0 ; 
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                one++;
            }else zero++ ;
        }
        int count = 0 ;
        for(int i=0;i<one;i++){
            if(nums[i]==1){
                count++ ;
            }
        }
        int max = count ; 
        for(int i=one;i<nums.size()+one;i++){
            int x = (i-one+nums.size())%nums.size() ; 
            int y = (i)%nums.size() ; 
            if(nums[x]==1&&nums[y]!=1){
                count-- ;
            }else if(nums[x]!=1&&nums[y]==1){
                count++ ;
            }
            if(count>max){
                max = count ;
            }
        }
        return one-max ;
    }
};