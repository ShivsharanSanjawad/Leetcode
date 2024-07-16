class Solution {
    public String largestOddNumber(String num) {
       
            if(num.charAt(num.length()-1)%2==1){
                 return num ;       
            }
            if(num.length()==1)
            return "" ;
            return largestOddNumber(num.substring(0, num.length()-1)) ;
    }
}