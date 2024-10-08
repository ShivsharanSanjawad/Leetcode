class MyCircularQueue {
    int a[] ; 
    int front = -1 ; 
    int rear = -1 ;
    public MyCircularQueue(int k) {
        this.a = new int[k] ; 
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false ;
        }
        if(isEmpty()){
            front ++  ;
        }
        rear = (rear + 1)%a.length ;
        a[rear] = value ; 
        return true ;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false; 
        }
        if(rear==front){
            rear = front = -1 ; 
            return true; 
        }
        front = (front+1)%a.length ;
        return true ;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1 ;
        }
        return a[front] ;
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1 ;
        }
        return a[rear];
    }
    
    public boolean isEmpty() {
        return (front ==rear )&&front==-1 ; 
    }
    
    public boolean isFull() {
        return ((rear+1)%a.length)==front; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */