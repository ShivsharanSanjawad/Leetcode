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
 import java.util.* ;
class Solution {
   
    ListNode head ;
    Random ra ;
    public Solution(ListNode head) {
            this.head = head ;
            ra = new Random() ;
    }
    
    public int getRandom() {
        ListNode temp = this.head ;
        int curr =  0 ; 
        int count = 1 ; 
        while(temp!=null){
            if(ra.nextInt(count)==0){
                curr = temp.val ;
            }
            count ++ ; 
            temp = temp.next ;
        }
        return curr ;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */