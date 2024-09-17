class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String ,Integer> h  = new HashMap<>() ; 
      String s = "" ;
      for(int i = 0 ;i<s1.length() ; i++){
        if(s1.charAt(i)!=' '){
            s = s + s1.charAt(i) ; 
        }else if(!s.equals("")){
           if(!h.containsKey(s))
               { h.put(s,1) ; 
                
               }else h.put(s,h.get(s)+1) ;
            s = "" ; 
        }else{
            s = "" ;
        }
      }
      if(s!=""){
         if(!h.containsKey(s))
        h.put(s,1) ; 
        else h.put(s,h.get(s)+1) ;
      }
      s = "" ;
      ArrayList<String> ans = new ArrayList<>() ; 
       for(int i = 0 ;i<s2.length() ; i++){
        if(s2.charAt(i)!=' '){
            s = s + s2.charAt(i) ; 
        }else if(!s.equals("")){
            if(!h.containsKey(s))
               { h.put(s,1) ; 
                
               }else h.put(s,h.get(s)+1) ;
            s = "" ; 
        }else s = "" ; 
      }
      if(s!=""){
         if(!h.containsKey(s))
               { h.put(s,1) ; 
                
               }else h.put(s,h.get(s)+1) ;
      }
      for(String key :h.keySet()){
        if(h.get(key)==1)
        
            ans.add(key) ; 
      }
    
      String a[] = new String[ans.size() ] ; 
      for(int i = 0 ;i<a.length; i++){
        a[i] = ans.get(i)  ; 
      }
      return a; 
      }
}