class Solution {
    public int minimumDeletions(String s, int k) {  
        HashMap<Character,Integer> h = new HashMap<>() ; 
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int ans = s.length() ;
        for(int a : h.values()){
            int count = 0 ; 
            for(int b:h.values()){
                if(a>b){
                    count +=b ; 
                }else if(b-a>k){
                    count += b-a-k ;
                }
            }
            ans = Math.min(ans,count);
        }
        return ans  ; 
    }
}