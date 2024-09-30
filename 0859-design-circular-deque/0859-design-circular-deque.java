class MyCircularDeque {
    int a[] ;
    int front  = -1; 
    int rear = -1;
    int size = 0 ; 
    public MyCircularDeque(int k) {
        a = new int[k] ;  
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false ;
        }
        if(isEmpty()){
            rear = 0 ;
            front = 0 ;
        }else
            front = (front-1+a.length)%a.length; 
            a[front] =value ; 
            size++ ;
        
            return true ;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false ;
        }
        if(isEmpty()){
            front = 0 ;
            rear = 0 ;
        }else 
            rear  = (rear+1+a.length)%a.length; 
            a[rear] = value ;
            size++ ;
        
            return true ;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false ;
        }
        if(front==rear){
            front = rear = -1 ;
        }else
        front = (front+1)%a.length ; 
        size --;
        return true ; 
    }

    
    public boolean deleteLast() {
        if(isEmpty()){
            return false ;
        }
        if(front==rear){
            front = rear = -1 ;
        }else
        rear = (rear-1+a.length)%a.length  ; 
        size -- ;
        
        return true ;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1 ;
        }
        return a[front] ; 
        
    }

    public int getRear() {
        if(isEmpty()){
            return -1 ;
        }
        return a[rear] ;
    }
    
    public boolean isEmpty() {
        return size==0 ;
    }
    
    public boolean isFull() {
        return (a.length)==size ;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */