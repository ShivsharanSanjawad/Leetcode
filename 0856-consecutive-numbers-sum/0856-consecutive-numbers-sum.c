int consecutiveNumbersSum(int n) {
    int count = 1; 
    for(int i =2 ;n>=(i*(i+1)/2);i++)
    {
        if(((n-(i*(i-1)/2))%i)==0)
        count++ ; 
    }
    return count ;
}