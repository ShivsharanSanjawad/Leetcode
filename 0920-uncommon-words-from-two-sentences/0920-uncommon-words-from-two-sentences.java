class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String ,Integer> h  = new HashMap<>() ; 
     String x1[] = s1.split(" ") ; 
     String x2 [] = s2.split(" ") ;
      for(int i = 0 ;i<x1.length ; i++){
        if(h.containsKey(x1[i])){
            h.put(x1[i],h.get(x1[i])+1) ;
        }else 
        h.put(x1[i],1) ;
      }
 for(int i = 0 ;i<x2.length ; i++){
        if(h.containsKey(x2[i])){
            h.put(x2[i],h.get(x2[i])+1) ;
        }else 
        h.put(x2[i],1) ;
      }
      ArrayList<String> ans = new ArrayList<>() ; 
      for(String x : h.keySet()){
        if(h.get(x)==1)
        ans.add(x) ;
      }
      String a[] = new String[ans.size() ] ; 
      for(int i = 0 ;i<a.length; i++){
        a[i] = ans.get(i)  ; 
      }
      return a; 
      }
}