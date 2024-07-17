class Solution {
     static int xor = 0 ;
    public   int subsetXORSum(int[] nums) {
        xor = 0  ;
        xOR(new ArrayList<Integer>(),nums , 0) ; 
        return xor  ;
    }

    public static void xOR(ArrayList<Integer>a,int []nums , int c){
        if(c==nums.length){
            int i = 0 ; 
            int x =0 ;
            while(i<a.size()){
                 x = x^a.get(i) ; 
                 i++ ;
            }
            xor  = xor + x;
            return  ;
         
        }
          xOR(a , nums , c+1) ; 
            a.add(nums[c]) ;
            xOR(a,nums , c+1) ;
            int i = 0 ; 
            int x =0 ;
            while(i<a.size()){
                 x = x^a.get(i) ; 
                 i++ ;
            }
    
    }
}