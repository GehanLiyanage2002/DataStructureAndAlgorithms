public class CircularQueueQuiz {

    int capacity;
    int front;
    int rear;
    int arr[];

    CircularQueueQuiz(int size) {
        capacity = size;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            System.out.println("Enqueue: " + x);
            display();
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Dequeue: " + arr[front]);
            if (front == rear) {  // only one element
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            display();
        }
    }

    // Method to display the current queue, front, and rear
    public void display() {
        System.out.print("Queue: ");
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
        System.out.println("Front = " + front + ", Rear = " + rear);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CircularQueueQuiz cq = new CircularQueueQuiz(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.dequeue();
        cq.enqueue(50);
        cq.enqueue(60);
        cq.dequeue();
        cq.enqueue(70);
    }
}
