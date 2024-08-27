/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverse(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* next = NULL;

    while (curr != NULL) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

struct ListNode* doubleIt(struct ListNode* head) {
    head = reverse(head);
    struct ListNode* temp = head;
    int carry = 0;

    while (temp->next != NULL) {
        int x = temp->val * 2;
        temp->val = (x + carry) % 10;
        carry = (x + carry) / 10;
        temp = temp->next;
    }

    int x = temp->val * 2;
    temp->val = (x + carry) % 10;
    carry = (x + carry) / 10;

    if (carry != 0) {
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = carry;
        newNode->next = NULL;
        temp->next = newNode;
    }

    return reverse(head);
}

