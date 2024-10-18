// will revisit and try again . 
// idea - find the non necessary pairs and in the neccessary pairs too find redudant one , and count accordingly , in pairs can be (1<<redudant)*(1<<non necessary) for non repeating . 
class Solution {
    // public ArrayList<Integer> get(int []nums){
    //     int or = 0 ;
    //     ArrayList<Integer> a  = new ArrayList<>() ;
    //      for(int i =0 ; i<nums.length;i++){
    //         if((or&(-nums[i]))==nums[i]){
    //         }else{
    //             a.add(nums[i]);
    //         }
    //     }
    //     return a;
    // } 
    // public ArrayList<Integer> get(ArrayList<Integer>nums){
    //     ArrayList<Integer> a  = new ArrayList<>() ;
    //     int or =0 ;
    //      for(int i =0 ; i<nums.size();i++){
    //         if((or&(-nums.get(i)))==nums.get(i)){
    //         }else{
    //             a.add(nums.get(i));
    //         }
    //     }
    //     return a;
    // } 

    public int countMaxOrSubsets(int[] nums) {
        Arrays.sort(nums)  ; 
        int or = 0 ; 
        for(int i = 0 ; i<nums.length ; i++){
            or = or|nums[i] ; 
        }
        return count(nums, 0,or,0);
    }
    public int count(int []nums,int i , int max , int curr){
        if(nums.length==i){
            return max==curr?1:0;
        }
        int left =count(nums,i+1,max,curr|nums[i]);
        int right = count(nums,i+1,max,curr);
        return left+right;
    }
}