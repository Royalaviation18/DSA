class sNode {
    int data;
    sNode next;

    sNode(int data) {
        this.data = data;
    }
}

class myStack {
    sNode head;
    int size;

    myStack() {
        head = null;
        size = 0;
    }

    public void push(int data) {
        sNode temp = new sNode(data);
        temp.next = head;
        size++;
        head = temp;

    }

    boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("Stack is empty ");
            return -1;
        }
    }

    int pop() {
        if (head == null) {
            System.out.println("\nStack is empty\n");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int sSize() {
        return size;
    }

    public static void main(String[] args) {
        myStack s1 = new myStack();
        System.out.println(s1.peek());
        System.out.println("\n Is stack empty : " + s1.isEmpty());
        System.out.println("\nSize of the stack : " + s1.sSize());
        System.out.println("\nInserting data");
        s1.push(10);
        s1.push(20);
        System.out.println("\nSize of the stack : " + s1.sSize());
        s1.push(30);
        System.out.println("\nSize of the stack : " + s1.sSize());
        System.out.println("\nTop element of the stack: " + s1.peek());
        System.out.println("\nRemoving the top of the stack: " + s1.pop());
        System.out.println("\nSize of the stack : " + s1.sSize());

    }
}
