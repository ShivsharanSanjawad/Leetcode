class Solution {

     public static double fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1) ;
      }
    public static int ncr(int n , int r){
        if(n==r)
        return 1;
        
       // if(r==(n/2)+1)

      //  return (int)Math.round((fact(n)/(fact(r)))/fact(n-r)) ;
        if(r>(n/2))
        r = n- r;
        int j =r ;
        double ans = 1 ;
            
        
        while(j>0){
            ans = ans*n; 
            n-- ;
            j-- ;
        }
        return (int)Math.round((ans/fact(r))) ;
    }

    public  List<Integer> getRow(int rowIndex) {
              ArrayList<Integer> a = new ArrayList<>() ;
              for(int i = 0 ; i<=rowIndex  ; i++){
                a.add(ncr(rowIndex,i)) ;
              }
              return a;
    }
}