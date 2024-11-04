class Solution {
    public String compressedString(String word) {
         StringBuilder s = new StringBuilder() ; 
         int n = word.length() ;
         for(int i = 0 ; i<n;){
            int count = 0 ; 
            char ch = word.charAt(i) ;
            while(i<n&&ch==word.charAt(i)){
                i++ ;
                count++ ; 
            }
            while(count>9){
                s.append(9);
                s.append(ch); 
                count -=9 ; 
            }
            if(count!=0){
                 s.append(count); 
                 s.append(ch); 
            }
            //System.out.println(s);
         }
         return s.toString() ;
    }
}