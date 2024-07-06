class MedianFinder {

        ArrayList<Integer> a  ; 

    public MedianFinder() {
        a  = new ArrayList<Integer>() ;
    }
    
    public void addNum(int num) {
        int j = 0 ; 
        
        while(j<a.size()&&a.get(j)<num){
            j++ ;
        }
         a.add(j, num);
    }
    
    public double findMedian() {
     
         if(a.size()%2==1)
         return a.get((a.size()-1)/2) ;
         return ((a.get(a.size()/2))+a.get(a.size()/2-1))/2.0 ;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */