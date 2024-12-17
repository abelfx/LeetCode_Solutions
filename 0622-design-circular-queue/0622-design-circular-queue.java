class MyCircularQueue {

    int k;
    int front;
    int rear;
    int[] number;
    int items;

    public MyCircularQueue(int k) {
        this.k = k;
        number = new int[k];
        front = 0;
        rear = 0;
        items = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        number[rear] = value;
        rear = (rear + 1) % k;
        items++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        front = (front + 1) % k;
        items--;
        return true;
    
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return number[front];
       
    }
    
    public int Rear() {
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
