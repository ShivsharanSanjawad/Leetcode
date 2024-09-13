class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i  =  0 ; 
        int j = numbers.length -1 ; 
        while(j>i){
            int sum = numbers[i] + numbers[j] ; 
            if(sum>target){
                j-- ; 
            }else if(sum<target){
                i++ ; 
            }else {
                int a[] = new int[]{i+1,j+1} ; 
                return a ;
            }
        }
        return new int[2];
    }
}