class Solution {
   public  boolean isPerfectSquare(int num) {
        if(num==1)
        return true ;
          
            return search(num,0,num) ;
    }

    public static boolean search(  int search , int s , int e){
       if(s>e)
        return false ; 
         double mid = s + (e-s)/2 ; 
         if(mid*mid==search)
         return true ; 
          double ans = mid*mid ;
         if(ans>search){
            return search(search,s,(int)mid-1) ;
         }else
         return search(search,(int)mid+1,e) ;
    }
}