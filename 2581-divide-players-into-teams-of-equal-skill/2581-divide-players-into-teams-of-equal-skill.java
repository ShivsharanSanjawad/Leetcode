class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length%2!=0){
            return -1 ;
        }
        Arrays.sort(skill) ; 
        int i = 0 ;
        int j = skill.length -1  ;
    long  product = 0 ;
        int sum = skill[i]+skill[j] ;
         while(j>i){
            if((skill[j]+skill[i])!=sum){
                return -1 ;
            }
            product +=skill[j]*skill[i] ;
            i++ ; 
            j-- ;
         }
         return product ;
    }
}