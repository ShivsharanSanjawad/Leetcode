class Solution {
    //static boolean [] visited ;
    public int[] buildArray(int[] nums) {
        // visited = new boolean [nums.length] ; 
        // get(nums,whatToFill,wheretoFill) ; 
        // return nums ;
        // nope mai new array na banane ke chakkar mai recursion kar raha hu, 
        // not feasible 
        // ok great idea from comments 
        // so i need to just make sure that i will not modify the number directly 
        // but modify in a such way that i can later see the old and new both value 
        // ok, and then i can choose accordingly what is needed 
        // great idea ,as per comments z = a + n*b 
        // so z/n would be b i.e. let say new value 
        // and z%n= a let say old value or , also can do b as old and a as new too 
        // why only n not other , can use anything greater than n , not less than n , why 
        //just think in kmp why we use 26 not less than that, same here too 
        int n = nums.length ;
        for(int i=0;i<nums.length;i++){
            int old = nums[i] ; 
            int newForThis = nums[nums[i]]%n ; 
            // nums[nums[i]]%n will give old value at nums[i] but that is new for this index
            nums[i] = newForThis*n + old ;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]/n ;
        }
        return nums ;
    }
    
}