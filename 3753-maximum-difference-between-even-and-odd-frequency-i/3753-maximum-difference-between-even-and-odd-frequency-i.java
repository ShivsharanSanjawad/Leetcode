class Solution {
    public int maxDifference(String s) {
        int [] a = new int[26] ;
        for(int i=0;i<s.length();i++){
            int x = s.charAt(i)-'a';
            a[x]++ ; 
        }
        int max1 = Integer.MIN_VALUE ; 
        int min1 = Integer.MAX_VALUE ; 
        int max2 = Integer.MIN_VALUE ; 
        int min2 = Integer.MAX_VALUE ;
        for(int i=0;i<26;i++){
            if(a[i]%2==0&&a[i]!=0){
                if(a[i]<min1){
                    min1 = a[i] ; 
                }
                if(a[i]>max1){
                    max1 = a[i] ;
                }
            }else{
                if(a[i]<min2){
                    min2 = a[i] ; 
                }
                if(a[i]>max2){
                    max2 = a[i] ; 
                }
            }
        }
        return Math.max(max2-min1,min2-max1);
    }
}