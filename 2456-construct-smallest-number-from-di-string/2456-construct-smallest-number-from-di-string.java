class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder b = new StringBuilder() ; 
        pattern = "I"+pattern ; 
        String s = pattern;
        int [] pre = new int[pattern.length()] ;
        for(int i=0;i<pattern.length();i++){
            int x = 0  ;
            if(s.charAt(i)=='D') continue ;
            for(int j=i+1;j<pattern.length();j++){
               if(s.charAt(j)=='D'){
                x++;
               }else break ; 
            }
            pre[i] = x;
        }
        boolean [] used = new boolean[9] ;
        System.out.println(Arrays.toString(pre));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                int x = b.charAt(i-1) -'0' ;
                b.append(x-1) ;
                used[x-1] = true ;
            }else {
                int j;
                for(j=0;j<9;j++){
                    if(!used[j]){
                        used[j] = true ;
                        break;
                    }
                }
                b.append(j+pre[i]+1);
            }
        }
        return b.toString();
    }
}