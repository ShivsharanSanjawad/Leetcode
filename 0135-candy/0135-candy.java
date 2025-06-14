class Solution {
    public int candy(int[] ratings) {
        int a[] = new int[ratings.length] ;
        int count = 0 ; 
        Arrays.fill(a,1) ;
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i+1]>ratings[i])
                a[i+1] =a[i]+1 ;
        }
            for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(a[i]<=a[i+1])
                a[i] =a[i+1]+1 ;
        }
            }
        for(int i=0;i<ratings.length;i++){
            count +=a[i] ;
        }
        return count ;
    }
}