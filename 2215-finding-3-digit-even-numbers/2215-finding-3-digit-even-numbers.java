class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits) ; 
        boolean flags[] = new boolean[1001];
        int n = digits.length ;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue ;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(j==k||i==k) continue;
                    if(digits[k]%2!=0) continue ;
                    int z = digits[i]*100+digits[j]*10+digits[k];
                    flags[z] = true ; 
                }
            }
        }
        ArrayList<Integer> x = new ArrayList<>() ; 
        for(int i=0;i<1001;i++){
            if(flags[i]){
                x.add(i);
            }
        }
        int a[] = new int[x.size()] ;
        for(int i=0;i<x.size();i++){
            a[i] = x.get(i) ;
        }
        return a;
    }
}