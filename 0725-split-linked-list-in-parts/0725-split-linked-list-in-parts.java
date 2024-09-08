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
    public int getSize(ListNode head){
        ListNode temp = head ; 
        int size =0 ; 
        while(temp!=null){
            temp = temp.next ; 
            size++ ; 
        }
        return size ;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        if(k==0||head==null){
            return new ListNode[k];
        }
        int n = getSize(head) ; 
      //  System.out.println(n) ;
        int x= n/k ; 
        int y = n% k ;
       // System.out.println(x+" "+y) ;
        ListNode []a =  new ListNode[k] ; 
        int z = 0 ; 
        ListNode prev = null ; 
        ListNode temp  = head ; 
        for(int i =0 ; i<y ; i++){  
            a[z++] = temp ;        
            for(int j = 0 ; j<x+1 ; j++){    
                prev = temp ; 
                temp = temp.next ;
            }
            prev.next = null ;
        }
        int ak ;
        if(x!=0)
        ak = (n-(y*(x+1)))/(x) ; 
        else 
         ak = n-y ;
        for(int i = 0 ;i<ak ; i++){
                a[z++] = temp ;
             for(int j = 0 ; j<x ; j++){
                prev = temp ; 
                temp = temp.next ;
            }
            prev.next = null ;
        }
        return a  ; 
    }
}