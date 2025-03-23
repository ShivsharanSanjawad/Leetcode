class Solution {
    public int maxLength(List<String> arr) {
       int x = get(arr,0,0) ;
       return Integer.bitCount(x) ;
    }
    public int get(List<String> a,int i, int x){
        if(i==a.size()){
            return x ;
        }
        boolean flag = true ;
        for(int j=0;j<a.get(i).length();j++){
            int z = a.get(i).charAt(j) -'a' ; 
            if((x&(1<<z))!=0){
                flag = false ; 
                break ;
            }
        }
        int nonOpt = get(a,i+1,x) ; 
        int opt = 0 ;
        if(flag){
            for(int j=0;j<a.get(i).length();j++){
              int z = a.get(i).charAt(j) -'a' ; 
               if((x&(1<<z))!=0){
                    return nonOpt ;
                }
              x |= 1<<z ;
            }
            opt = get(a,i+1,x) ;
        }
        int p = Integer.bitCount(opt) ; 
        int q = Integer.bitCount(nonOpt) ; 
        return p>=q?opt:nonOpt ; 
    }
}