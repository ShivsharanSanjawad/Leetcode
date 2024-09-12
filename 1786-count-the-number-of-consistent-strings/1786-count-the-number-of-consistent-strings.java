class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =  0 ;
     //  HashMap<Character , Integer>h = new HashMap<>() ;
     boolean x [] = new boolean[26] ; 

        for(int i = 0 ; i<allowed.length() ; i++){
         //   h.put(allowed.charAt(i),i) ;
            x[allowed.charAt(i)-'a'] = true ; 
        }
      
        for(int i = 0 ; i<words.length ; i++){
              boolean flag = true ; 
            for(int j = 0 ; j<words[i].length() ; j++){
                if(!x[words[i].charAt(j)-'a']){
                    flag = false ; 
                    break ;
                }
            }
            if(flag)
            count ++ ; 
        }
        
        return count;

    }
}