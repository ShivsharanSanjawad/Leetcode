class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =  0 ;
        HashMap<Character , Integer>h = new HashMap<>() ; 
        for(int i = 0 ; i<allowed.length() ; i++){
            h.put(allowed.charAt(i),i) ;
        }
        for(int i = 0 ; i<words.length; i++){
            boolean flag = true  ;
            for(int j = 0 ; j<words[i].length() ; j++){
                if(!h.containsKey(words[i].charAt(j))){
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