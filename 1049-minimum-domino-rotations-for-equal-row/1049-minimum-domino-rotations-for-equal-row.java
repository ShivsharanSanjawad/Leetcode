class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int a[] = new int[6] ; 
        for(int i=0;i<tops.length;i++){
            a[tops[i]-1]++ ; 
            if(tops[i]==bottoms[i]){
                continue ;
            }
            a[bottoms[i]-1]++ ;
        }
        int max = -1 ; 
        int id = -1 ; 
        for(int i=0;i<6;i++){
            if(a[i]>max){
                max = a[i] ; 
                id = i+1 ; 
            }
        }
       // System.out.println(id+" "+max+" "+tops.length) ;
       // obvisiouly isme flaw to hai i.e. if repeated max frequency ho to ? 
       // usse handle nahi kiya but still testcases loose hai 
        if(max<tops.length||id==-1){
            return -1 ;
        }
        int count1 = 0 ; 
        int count2 = 0 ; 
        for(int i=0;i<tops.length;i++){
            if(tops[i]!=id){
                count1++ ; 
            }
            if(bottoms[i]!=id){
                count2++ ;
            }
        }
        return Math.min(count1,count2);
    }
}