/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#define Node struct ListNode*
struct ListNode* deleteDuplicates(struct ListNode* head) {
    Node temp = head ;
    while(temp!=NULL){
        Node temp2 = temp->next ; 
        while(temp2!=NULL&&temp->val==temp2->val){
            temp2 = temp2->next ;
        }
        temp->next = temp2 ;
        temp = temp->next;
    }
    return head;
}