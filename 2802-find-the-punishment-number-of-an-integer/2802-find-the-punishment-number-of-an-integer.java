class Solution {
    HashMap<String,ArrayList<Integer>> dp;
    public int punishmentNumber(int n) {
        dp = new HashMap<>();
        int sum =0 ; 
        for(int i = 1 ; i<=n;i++){
            ArrayList<Integer> x =isKaplekar(Integer.toString(i*i)) ; 
            //System.out.println(x);
            if(x.contains(i)){
                sum +=i*i ;
            }  
        }
        return sum;
    }
    public ArrayList isKaplekar(String s){
      //  System.out.println(s);
        if(s.length()==1){
            ArrayList<Integer> a = new ArrayList<>() ;
            a.add(Integer.parseInt(s));
            return a;
        }
        if(dp.containsKey(s)){
            return dp.get(s);
        }
        ArrayList<Integer> ans = new ArrayList<>() ;
        ans.add(Integer.parseInt(s));
        for(int i =1 ;i<s.length();i++){
            int y = Integer.parseInt(s.substring(0,i)) ; 
            ArrayList<Integer> x = isKaplekar(s.substring(i,s.length()));
           // System.out.println(x);
            for(int j=0 ;j<x.size();j++){
                ans.add(y+x.get(j));
            }
        }
        dp.put(s,ans) ;
        return ans ;
    }
}