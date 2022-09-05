//Finding middle Element 
//Deleting middle Element


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    public static void traverse(Node head){
        if(head == null){
            System.out.println("\n The linked list is empty\n");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static int midElement(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static Node delMidElement(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = slow;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        slow = null;

        return head;
        
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        System.out.println("\n The linkedlist is now : ");
        traverse(head);

        System.out.println("\n The middle element is \n") ;
        System.out.println(midElement(head));

        System.out.println("\nDeleting middle element....");
        delMidElement(head);
        System.out.println("\n The list is now\n");
        traverse(head);

    }
}
