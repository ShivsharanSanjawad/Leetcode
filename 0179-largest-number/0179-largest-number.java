class Solution {
    public String largestNumber(int[] nums) {
        String[]ans = new String[nums.length]; 
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = Integer.toString(nums[i]) ;  
        }
        Comparator<String> cp = new Comparator<>(){
           public int compare(String c1, String c2) {
                String o1 = c1 + c2;
                String o2 = c2 + c1;
                return o2.compareTo(o1); 
            }
        } ; 


        Arrays.sort(ans , cp) ; 
        if(ans[0].equals("0")){
            return "0" ;
        }
        String x = ""  ; 
        for(int i = 0 ; i<nums.length; i++){
            x = x + ans[i] ; 
        }
        return x ;
    }
}