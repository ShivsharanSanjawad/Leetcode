/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
#define Node struct ListNode* 

Node newNode(int n){
    Node  node = malloc(sizeof(Node)) ; 
    node->val = n ;
    node->next = NULL ;
    return node;
}

Node merge(Node temp1, Node temp2){
    if(temp1==NULL){
        return temp2;
    }
    if(temp2==NULL){
        return temp1 ;
    }
    if(temp1->val<temp2->val){
        temp1->next = merge(temp1->next , temp2);
        return temp1 ;
    }
    else{
        temp2->next = merge(temp1,temp2->next);
        return temp2;
    }
}
Node mid(Node temp){
    Node slow = temp ;
    Node  prev = NULL ;
    Node fast = temp ; 
    while(fast!=NULL&&fast->next!=NULL){
        fast = fast->next->next ; 
        prev  = slow ;
        slow = slow->next ;
    }
    if(prev!=NULL)
    prev->next = NULL ;
    return slow ;
}
Node  sort(Node temp){
    if(temp==NULL||temp->next==NULL){
        return temp;
    }
    return merge(sort(temp),sort(mid(temp))) ;
}
struct ListNode* sortList(struct ListNode* head) {
    return sort(head);
}