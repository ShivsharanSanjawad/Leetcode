class ProductOfNumbers {
    ArrayList<Long> a ; 
    PriorityQueue<Integer> zero ;
    public ProductOfNumbers() {
        a = new ArrayList<>() ;
        a.add(1L) ; 
        zero = new PriorityQueue<>(Collections.reverseOrder()) ;
    }
    
    public void add(int num) {
        long x = a.get(a.size()-1) ; 
        if(num!=0)
        a.add(x*num) ;
        else{
        a.add(1L);
        zero.add(a.size()-1);
        }
    }
    
    public int getProduct(int k) {
        // System.out.println(a);
        // System.out.println(zero);
        if(ok(a.size()-k))
        return (int)(a.get(a.size()-1)/a.get(a.size()-1-k)) ;
        return 0 ; 
    }
    
    public boolean ok(int k){
        if(zero.size()==0) return true ;
       return zero.peek()<k ;
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */