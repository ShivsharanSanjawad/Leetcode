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
    public ListNode middleNode(ListNode head) {
        int size = 0 ;
          ListNode temp = head ; 
          while(temp.next!=null){
            temp = temp.next ;
            size ++ ;
          }
          int mid = size /2 ; 
          if(size%2!=0)
          mid ++ ;
            temp = head ;
          while(mid>0){
            temp = temp.next ;
            mid -- ;
          }
          return temp ;
    }
}