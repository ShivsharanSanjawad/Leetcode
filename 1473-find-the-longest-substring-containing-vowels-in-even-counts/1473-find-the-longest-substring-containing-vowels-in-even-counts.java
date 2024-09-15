class Solution {
    public int findTheLongestSubstring(String s) {
        int count = 0 ; 
        int max  = 0; 
        HashMap<Integer , Integer> h = new HashMap<>() ; 
        h.put(0,-1) ; 
        for(int i = 0 ; i<s.length() ; i++){
           
            switch(s.charAt(i)){
                case 'a' ->{
                    count ^=(1<<0) ; 
                }
                case 'e' ->{
                    count ^= (1<<1) ; 
                }
                case 'i' ->{
                    count ^=(1<<2) ;
                }
                case 'o'->{
                    count^=(1<<3) ; 
                }
                case 'u' ->{
                    count ^=(1<<4) ;
                }
            }
            if(h.containsKey(count)){
               // System.out.println(i+" "+h.get(count)) ;
                max = Math.max(max , i-h.get(count)) ; 
            }else {
                h.put(count , i);
            }
        }
        return max ;

    }
}