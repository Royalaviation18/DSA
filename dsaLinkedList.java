import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    static Node removeLoop(Node head) {
        Node slow = head, fast = head;
        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
            if (slow == fast) {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
        
        return head;
    }

    // detecting loops in linkedlist
    static boolean detectLoops(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // removing duplicates in an unsorted linkedlist
    static Node duplicateUnSorted(Node head) {
        HashSet<Integer> hs = new HashSet<>();
        Node cur = head, prev = null;
        while (cur != null) {
            int curVal = cur.data;
            if (hs.contains(curVal)) {
                prev.next = cur.next;
            } else {
                hs.add(curVal);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    // removing duplicates in a sorted Linked List
    static Node duplicatesSorted(Node head) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.data == cur.next.data) {
                Node temp = cur.next;
                cur.next = cur.next.next;
                temp = null;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    // recurssion palindrome (not working as of now)
    static boolean isPalindrome(Node left, Node right) {
        if (right == null) {
            return true;
        }
        boolean first = isPalindrome(left, right.next);

        if (first == false) {
            return false;
        }
        boolean second = (right.data == left.data);
        left = left.next;
        return second;

    }

    // reversing the linkedlist
    static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head, next = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void reverseTraverse(Node head) {
        // System.out.println("hello");
        if (head == null) {
            return;
        }
        reverseTraverse(head.next);
        // System.out.println("Rohit");
        System.out.println(head.data);
        // head = head.next;
    }

    // deleting the entire LinkedList
    static Node deleteLinkedList(Node head) {

        Node temp = head;
        if (head == null) {
            temp = null; // corner case ke liye, if ek hi element ho to
            System.out.println("The linkedList is empty");
        } else {
            head = head.next;
            while (head != null) {
                temp = null;
                temp = head;
                head = head.next;
            }
        }
        return head;
    }

    // deleting the middle Element
    static Node deleteMidElement(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = slow;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        slow.next = null;
        return head;
    }

    // finding the middle Element
    static int middleElement(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // insertion
    static void insert(int data, Node head, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.data = data;
            newNode.next = null;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    // traverse
    static void traverse(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty");
        }
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    // deletion
    static void delete(Node head, int pos) {
        if (pos == 0) {
            // If we need to delete the head, then making the next element as head
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(50);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;

        // traversing through the linked list
        // traverse(head);
        // // Printing the middle Element
        // System.out.println(middleElement(head));
        // // returning head from deleteMidElement
        // // // head = deleteMidElement(head);
        // // // printing the ll after removing the middle element
        // // traverse(head);

        // // System.out.println("Deleting the entire LL");
        // // // head = deleteLinkedList(head);
        // // // traverse(head);

        // // printing the reverse linkedList
        // // head = printReverse(head);
        // // System.out.println(reverseTraverse(head));
        // // Printing the reverse of ll recursively without reversing or any additional
        // // space
        // System.out.println("\nPrinting reverse of linkedlist without reversing the
        // ll\n");
        // reverseTraverse(head);

        // // System.out.println("\n Reverse of the linkedlist\n");
        // // head = reverseLinkedList(head);
        // // traverse(head);
        // // System.out.println(isPalindrome(head, head)); not working

        // // remove duplicates in a sorted linked list

        // // head = duplicatesSorted(head);
        // System.out.println("\nAfter removing duplicates in a sorted linkedlist\n");
        // // traverse(head);

        // head = duplicateUnSorted(head);
        // System.out.println("\nAfter removing duplicates in an unsorted
        // linkedlist\n");
        // traverse(head);

        System.out.println("\n Does the linkedlist contains loop: ");
        System.out.println(detectLoops(head));

        head = removeLoop(head);
        System.out.println("\nDoes the linkedlist contains loop now ? : ");
        System.out.println(detectLoops(head));

    }
}
