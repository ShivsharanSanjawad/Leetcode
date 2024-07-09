class Solution {
public:
    bool isHappy(int n) {
        int a = 0 ; 
        while(n!=1)
        {    int temp = n ; 
            int sum = 0 ; 
            for(int i  = 0  ; temp>0 ; i++)
            {
                sum = sum + (temp%10)*(temp%10) ; 
                temp = temp /10 ; 
            }
            n = sum ; 
            a++ ;
            if(a==100)
            return 0 ; 
        }
        return 1 ; 
    }
};