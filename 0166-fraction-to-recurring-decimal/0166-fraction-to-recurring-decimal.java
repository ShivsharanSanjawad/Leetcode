class Solution {
     public static String fractionToDecimal(long numerator, long denominator) {
        boolean flag = false ;
         if(numerator<0&&denominator<0){

         }else if(numerator<0||denominator<0){
                flag =true ;
         }
        numerator = Math.abs(numerator) ; 
        denominator = Math.abs(denominator) ;

        long result = numerator / denominator;
        StringBuilder res = new StringBuilder();
        if(flag&&numerator!=0)
        res.append("-") ;
        res.append(Long.toString(result));
        long remainder = numerator % denominator;
        if (remainder == 0) {
            return res.toString();
        }
        res.append(".");
        int startInd = res.length();
        ArrayList<Long> remList = new ArrayList<>();

        while (remainder != 0) {
            if (remList.contains(remainder)) {
                res.append(")");
                if (remList.contains(remainder)) {
                    int tempIndex = remList.indexOf(remainder);
                    int finalIndexToChange = tempIndex + startInd;
                    result = remainder * 10 / denominator;
                    String stringToAdd = "(" + Long.toString(result);
                    return res.replace(finalIndexToChange, finalIndexToChange + 1, stringToAdd).toString();
                }
            }
            remList.add(remainder);
            remainder *= 10;
            result = remainder / denominator;
            remainder %= denominator;
            res.append(result);
        }
        String ans = res.toString();
        return ans.replace("(", "");
    }

    

    
}