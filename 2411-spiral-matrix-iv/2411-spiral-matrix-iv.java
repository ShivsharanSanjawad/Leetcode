/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int a[][] = new int[m][n] ; 
        char [] dir = {'E','S','W','N'} ; 
        int curr= 0 ; 
        int [] constr = {n-1,m-1,0,0};
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                a[i][j] = -1 ;
            }
        }
        int x = 0 ; 
        int y = 0 ; 
        ListNode temp = head ; 
        while(temp!=null){
           // temp  = temp.next ;
            switch(curr){
                case 0 ->{
                    if(x<constr[0]){
                        a[y][x++] = temp.val  ; 
                        temp = temp.next ; 
                    }else{
                       // x-- ;
                       a[y][x] = temp.val ; 
                       temp = temp.next ;
                        y++ ;
                        constr[3]++ ; 
                        curr = 1 ; 
                    }
                    // if((constr[0]+1)==x)
                    // x-- ; 
                }
                case 1 ->{
                   // System.out.println(constr[1]+" "+y) ;
                    if(y<constr[1]){
                        a[y++][x] = temp.val; 
                        temp =temp.next ; 
                    }else{
                       // y-- ;
                       a[y][x] = temp.val ; 
                       temp = temp.next ;
                        x-- ;
                        constr[0]-- ; 
                        curr = 2 ;
                    }
                    // if((constr[1]+1)==y)
                    // y-- ; 
                }
                case 2 ->{
                    if(x>constr[2]){
                        a[y][x--] = temp.val ; 
                        temp = temp.next ;
                    }else{
                      //  x++ ;
                      a[y][x] = temp.val ; 
                       temp = temp.next ;
                        y-- ;
                        constr[1] --;
                        curr = 3 ;
                    }
                    // if((x+1)==constr[2])
                    // x++ ;
                }
                case 3 ->{
                    if(y>constr[3]){
                        a[y--][x] = temp.val ;
                        temp =temp.next ; 
                    }else{
                      //  y++ ;
                      a[y][x] = temp.val ; 
                       temp = temp.next ;
                        x++ ;
                        constr[2]++ ;
                        curr = 0 ;
                    }
                    // if((y+1)==constr[3])
                    // y++ ;
                }                
            }
        }
        return a ;
    }
}