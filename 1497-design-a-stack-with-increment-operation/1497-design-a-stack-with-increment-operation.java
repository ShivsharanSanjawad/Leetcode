class CustomStack {
    int stack[] ; 
    int top =-1  ; 
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize] ; 
    }
    
    public void push(int x) {
        if(top!=stack.length-1){
            stack[++top] = x ; 
        }
    }
    
    public int pop() {
        if(top!=-1){
            return stack[top--] ;
        }
        return -1 ;
    }
    
    public void increment(int k, int val) {
        for(int i = 0 ; i<k&&i<stack.length ; i++){
           
            stack[i] +=val ;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */