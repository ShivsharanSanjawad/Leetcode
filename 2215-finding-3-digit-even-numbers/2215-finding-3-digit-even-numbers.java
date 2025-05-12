class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int [] freq = new int[10] ;
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++ ;
        }
        ArrayList<Integer> y = new ArrayList<>(); 
        for(int i=100;i<1000;i+=2){
            int [] freq2 = new int[10] ; 
            int x = i ; 
            while(x>0){
                freq2[x%10]++ ;
                x /=10 ;
            }
            boolean flag = true ;
            for(int j=0;j<10;j++){
                if(freq2[j]>freq[j]){
                    flag = false ; 
                    break ;
                }
            }
            if(flag){
                y.add(i);
            }
        }
        int a[] = new int[y.size()] ;
        for(int i=0;i<y.size();i++){
            a[i] = y.get(i) ;
        }
        return a;
    }
}