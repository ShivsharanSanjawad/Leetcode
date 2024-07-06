class Solution {
    public int sum(int x){
        if(x<10)
        return x;
        return (x%10)+sum(x/10);
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x%sum(x)==0)
        return sum(x) ;
        return -1 ;
    }
}