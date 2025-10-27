public class CircularQueue {

     int capacity;
     int front;
     int rear;

    int arr[];

    CircularQueue(int size) {
        capacity = size;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity -1) {
            return true;

        }
        else if (front == rear + 1) {
            return true;

        } else{
            return false;

        }
        
    }

    public void enqueue(int x) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;

            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            System.out.println("Inserting Element : " + arr[rear]);
        }
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Removing Element : " + arr[front]);
            if (front == rear) {
                front = -1;
                rear = -1;

            }
            else {
                front = (front + 1) % capacity;
            }
        }
    }



    public static void main(String[] args) {
        
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);

        cq.dequeue();
        cq.dequeue();

        cq.enqueue(60);
        cq.enqueue(70);
    }



    
}
