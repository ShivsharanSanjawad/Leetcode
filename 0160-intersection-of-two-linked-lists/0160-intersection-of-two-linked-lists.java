/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
         ListNode temp1 = headA  ; 
         ListNode temp2 = headB ; 
         Stack<ListNode> s1 = new Stack<>() ; 
         Stack<ListNode> s2 = new Stack<>() ; 
         while(temp1!=null){
            s1.push(temp1) ; 
            temp1 = temp1.next ; 
         }  
         while(temp2!=null){
            s2.push(temp2) ; 
            temp2 = temp2.next ;
         }
         if(s1.peek()!=s2.peek())
         return null ; 
         ListNode prev = s1.peek() ;
         while(!s1.isEmpty()&&!s2.isEmpty()&&s1.peek()==s2.peek()){
            prev = s1.pop() ;
            s2.pop() ;
         }

         return prev ;
    }
}