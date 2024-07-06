class Solution {
    public int lastRemaining(int n) {
        if(n==1)
        return 1;
        return 1+ fun(n,1);
    }

    public int fun(int n , int d){
         if(n==2&&d==-1)
        return  0 ;
       if(n<=3)
       return 1;
       
       
        if((n%2==0)&&(d==-1))
        return 2*fun(n/2 , -d);
        return 1 + 2*fun(n/2 , -d) ;
    }
}