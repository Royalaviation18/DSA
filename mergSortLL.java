// I/P : 1->3->6->2->7
// O/P : 1->2->3->6->7

class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
    }

    static void traverse(LLNode head) {
        LLNode cur = head;
        if (head == null) {
            System.out.println("\n The linked list is empty\n");
        } else {
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
    }

  
    // 1->3->null
    // 6->2->7->null
    static LLNode mergeOp(LLNode h1,LLNode h2){
        if(h1 ==null || h2==null){
            //if h1 null hua pehle to h2 return or h2 null hua pehle to h1 return;
            return (h1==null)?h2:h1;
        }
        if(h1.data<h2.data){
            h1.next = mergeOp(h1.next, h2);
            return h1;  
        }
        else{
            h2.next = mergeOp(h1, h2.next);
            return h2;
        }
    }


    //middle element se tod kar, divide karenge ll ko
    //as mergeSort follows divide and conqueror
    static LLNode mergeSort(LLNode head){
        if(head == null || head.next==null){
            return head;
        }
        LLNode slow = head;
        LLNode fast = head;
        LLNode pre = slow;
        while(fast!=null &&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        LLNode h1 = mergeSort(head);
        LLNode h2 = mergeSort(slow);

        return mergeOp(h1,h2);
    }


    public static void main(String[] args) {
        LLNode n1 = new LLNode(1);
        LLNode n2 = new LLNode(3);
        LLNode n3 = new LLNode(6);
        LLNode n4 = new LLNode(2);
        LLNode n5 = new LLNode(7);

        LLNode head1 = n1;
        head1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("\n Traversing through the linked list\n");
        traverse(head1);

        head1 = mergeSort(head1);
        System.out.println("\n After performing merge Sort\n");
        traverse(head1);



    }

}
