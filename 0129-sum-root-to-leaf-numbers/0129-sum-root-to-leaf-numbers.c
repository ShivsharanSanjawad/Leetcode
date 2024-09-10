/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int sum = 0 ;
void get(struct TreeNode*root,int x){
    if(root==NULL){
        return ;
    }
    x = (x*10) + (root->val) ; 
    if(root->left==NULL&&root->right==NULL){
        sum  +=x ; 
        return;
    }
    get(root->left,x) ; 
    get(root->right,x) ;
}
int sumNumbers(struct TreeNode* root) {
    sum = 0 ;
    get(root,0) ; 
    return sum; 
}