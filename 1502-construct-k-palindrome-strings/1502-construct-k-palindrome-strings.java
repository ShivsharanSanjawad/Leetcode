class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()){
            return false ;
        }
        int a[] = new int[26] ;
        for(int i = 0 ; i<s.length();i++){
            int x = s.charAt(i) -'a'; 
            a[x] +=1 ;
        }
        int count = 0 ; 
        for(int i =  0 ; i<26;i++){
            if((a[i]%2)==1){
                count++ ;
            }
        }
        // System.out.println(Arrays.toString(a));
        // System.out.println(count);
        if(count>k){
            return false ;
        }
        return true ;

    }
}