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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1 ; 
        int i = 0 ;
        ListNode start , end ;
        start = null ; 
        end  = null ;
        while(temp.next!=null){
            if(i==a-1){
                start = temp ;
            }
            if(i==b){
                end = temp.next ;
            }
            i++ ;
            temp = temp.next ;
        }
        start.next = list2 ;
        temp = list2 ;
        while(temp.next!=null)
        {
            temp = temp.next ;
            
        }
        temp.next = end ;
        return list1 ;
    }
}