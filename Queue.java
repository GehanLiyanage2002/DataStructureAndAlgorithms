public class Queue {

    int front;
    int rear;
    int capacity;
    int noOfItems;


    int QueueArr[];

    Queue(int size) {
        capacity = size;
        front = 0;
        rear = -1;

        QueueArr = new int[size];
    }

    public boolean isFull() {
        
        return rear + 1 == capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int x) {

        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            QueueArr[rear] = x;
            System.out.println("Inserting : " + x );
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Uderflow");
        } else {
            System.out.println("Removing : " + QueueArr[front]);
            front++;
        }
    }



    public static void main(String[] args) {

        Queue myQueue = new Queue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);    
        myQueue.enqueue(40);

        myQueue.dequeue();
        myQueue.dequeue();
    }

    

    
}
