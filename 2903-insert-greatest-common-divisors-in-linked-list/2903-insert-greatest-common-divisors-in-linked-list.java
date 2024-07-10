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
     int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head ;
        while(temp!=null&&temp.next!=null){
            ListNode node = new ListNode(gcd(temp.val , temp.next.val)) ;
            node.next = temp.next ;
            temp.next = node ; 
            temp = node.next ;

        }
        return head ;
    }
}