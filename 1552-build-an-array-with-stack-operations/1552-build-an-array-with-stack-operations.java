class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> x = new ArrayList<>() ; 
        int i = 0 ; 
        int y = 0 ;
       while(y<target.length){
            if(target[y]==(i+1)){
                x.add("Push") ;
                 
            }else{
                while(target[y]>(i+1)){
                x.add("Push") ; 
                x.add("Pop"); 
                i++ ;
                }
                x.add("Push") ;
            }
            i++ ; 
             y++ ; 
          
        }
        return x ; 
    }
}