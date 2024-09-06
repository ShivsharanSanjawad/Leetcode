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
    public void print(ListNode head){
        ListNode temp = head ; 
        while(temp!=null){
            System.out.print(temp.val+"->") ; 
            temp = temp.next ; 
        }
        System.out.println() ; 
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
       Arrays.sort(nums) ;
       ListNode temp = head ; 
       ListNode prev = null ; 
       while(temp!=null){
      //  print(head) ;
            if(Arrays.binarySearch(nums,temp.val)>=0){
                if(temp==head){
                    head = head.next ; 
                    prev = temp  ; 
                    temp = temp.next ;
                    continue ;
                }else{
                    prev.next = temp.next ;
                    temp = temp.next ; 
                    continue ; 
                }
            }else{

            }
            prev = temp ; 
            temp = temp.next ;
       } 
       return head ;
    }
}