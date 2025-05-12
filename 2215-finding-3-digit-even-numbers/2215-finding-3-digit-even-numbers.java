class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits) ; 
        HashSet<Integer> x = new HashSet<>() ;
        int n = digits.length ;
        for(int i=0;i<n;i++){
            if(digits[i]%2!=0) continue ;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(j==k||i==k) continue;
                    if(digits[k]==0) continue ;
                    int z = digits[i]+digits[j]*10+digits[k]*100 ;
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