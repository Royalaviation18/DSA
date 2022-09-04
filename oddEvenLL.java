//I/P : 1->2->3->4->5
//O/P : 1->3->5->2->4

class LNode {
    int data;
    LNode next;

    LNode(int data) {
        this.data = data;
    }

    static void traverse(LNode head) {
        LNode cur = head;
        if (head == null) {
            System.out.println("\n The linked list is empty\n");
        } else {
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
    }

    static LNode oddEven(LNode head) {
        LNode odd = head;
        LNode even = head.next, temp = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;

        }
        odd.next = temp;
        return head;

    }

    public static void main(String[] args) {
        LNode n1 = new LNode(1);
        LNode n2 = new LNode(2);
        LNode n3 = new LNode(3);
        LNode n4 = new LNode(4);
        LNode n5 = new LNode(5);

        LNode head1 = n1;
        head1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("\n Traversing through the linked list\n");
        traverse(head1);

        head1 = oddEven(head1);
        System.out.println("\nTraversing after odd even position\n");
        traverse(head1);

    }

}
