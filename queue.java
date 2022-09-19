import java.util.*;

class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
    }
}

class Queue {
    QNode front, rear;

    boolean isEmpty(){
        return front == null;
    }

    void enqueue(int data) {
        QNode newNode = new QNode(data);

        if (front == null) { // Empty Queue
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            return -1;
        }
        int result = front.data;
        front = front.next;
        return result;
    }

    public static void main(String[] args) {
        Queue q1 = new Queue();
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello , to the queue program");
        System.out.println("\nIs queue Empty: " +q1.isEmpty());
        System.out.println("\nEnter the data to be inserted: ");
        data = sc.nextInt();
        q1.enqueue(data);
        q1.enqueue(5);
        q1.dequeue();
        System.out.println("\nIs queue Empty: " +q1.isEmpty());
    }
}
