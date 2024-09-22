class Solution {
    List<Integer> x ; 
    public void get(int i , int n){
        if(i>n){
            return ; 
        }
        x.add(i) ; 
        for(int j= 0 ; j<10 ; j++){
            get(i*10+j , n) ; 
        }
    }
    public List<Integer> lexicalOrder(int n) {
        this.x = new ArrayList<>() ; 
        for(int i = 1  ; i<10 ;i++)
        get(i,n) ; 
        return x ;
    }
}