class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits) ; 
        HashSet<Integer> x = new HashSet<>() ;
        int n = digits.length ;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue ;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(j==k||i==k) continue;
                    int z = digits[i]*100+digits[j]*10+digits[k] ;
                    if(z%2==0)
                    x.add(z) ; 
                }
            }
        }
        int a[] = new int[x.size()] ; 
        int i= 0 ;
        for(Integer k:x){
            a[i++] = k ;
        }
        Arrays.sort(a);
        return a;
    }
}