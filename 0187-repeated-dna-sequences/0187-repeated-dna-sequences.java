class Solution {
    HashMap<Integer,Integer> h ;
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10){
            return new ArrayList<String>() ;
        }
          h  = new HashMap<>() ;
          int n = getInt(s) ; 
          h.put(n,1) ;
          for(int i = 10 ; i<s.length();i++){
                n = updateInt(n,s.charAt(i)) ;
                h.put(n,h.getOrDefault(n,0)+1) ;
          }
          List<String> ans = new ArrayList<>() ; 
          for(Map.Entry<Integer,Integer> e:h.entrySet()){
                if(e.getValue()>1){
                    ans.add(getString(e.getKey())) ;
                }
          }
          return ans;
    }
    public int getInt(String s){
        int ans = 0 ; 
        for(int i = 0 ; i<10;i++){
            switch(s.charAt(i)){
                case 'A' ->{ans = ans|0 ;} 
                case 'C' ->{ans = ans|1 ;}  
                case 'G' ->{ans = ans|2 ;}  
                case 'T' ->{ans = ans|3 ;} 
            }
            ans = ans<<2 ; 
        }
        ans = ans>>2 ;
        return ans ;
    }
    public int updateInt(int n , char c){
        int toRemove = ~(3<<18) ;
        n = n&toRemove ;
        n = n<<2 ; 
        switch(c){
                case 'A' ->{n = n|0 ;} 
                case 'C' ->{n = n|1 ;}  
                case 'G' ->{n = n|2 ;}  
                case 'T' ->{n = n|3 ;}  
        }
        return n;
    }
    public String getString(int n){
        char c[] = new char[10] ; 
        int x = 9 ; 
        while(x>=0){
            int temp = n&3 ; 
            switch(temp){
                case 0 ->{c[x--]='A' ;} 
                case 1 ->{c[x--]='C' ;}
                case 2 ->{c[x--]='G' ;}
                case 3 ->{c[x--]='T' ;}
            }
            n = n>>2 ;
        }
        return new String(c);
    }
}