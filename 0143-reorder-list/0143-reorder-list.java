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
    public void reorderList(ListNode head) {
        if(head.next==null)
        return ;
            ArrayList<Integer> a = new ArrayList<>() ; 
            ListNode temp = head ; 
            while(temp!=null){
                a.add(temp.val) ; 
                temp = temp.next ;
            }
            int s = 1; 
            int e = a.size()-1 ;
                temp = head ;
                ListNode prev =null;
            while(e>=s){
                temp.next = new ListNode(a.get(e--)) ; 
                temp = temp.next ; 
                prev = temp ;
                if(e!=s){
                temp.next = new ListNode(a.get(s++)) ;
                temp = temp.next ;
                }
            }
            prev.next = null;
            

    }
}