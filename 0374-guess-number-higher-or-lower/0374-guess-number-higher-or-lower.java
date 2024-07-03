/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       return search(0,n) ;


    }

    public int search(int s , int e){
        
            int mid = s+(e-s)/2 ; 
            if(guess(mid)==0)
            return mid  ; 
            if(guess(mid)==-1)
           
            return search(s,mid);
             return search(mid+1,e) ; 
    }
        
}