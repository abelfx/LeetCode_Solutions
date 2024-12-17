class MyCircularDeque {

    int k;
    int[] number;
    int front;
    int rear;
    int items;
    public MyCircularDeque(int k) {
        this.k = k;
        number = new int[k];
        front = 0;
        rear = 0;
        items = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }

        front = (front - 1 + k) % k;
        number[front] = value;
        items++;
        return true;

    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }

        number[rear] = value;
        rear = (rear + 1) % k;
        items++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }

        front = (front + 1) % k;
        items--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }

        rear = (rear - 1 + k) % k;
        items--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }

        return number[front];
        
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }

        return number[(rear - 1 + k) % k];
        
    }
    
    public boolean isEmpty() {
        return items == 0;
    }
    
    public boolean isFull() {
        return items == k;
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