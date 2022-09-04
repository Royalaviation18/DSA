class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    //intersetion of two LinkedList
    //First LinkedList : 1->2->3->4->5->Null
    //Second Linkedlist : 8->6->4->5->Null
    //logic yeh ki if first linked list if null hojae to equate it to head2 and if second linked list null hojae to equate it to head1

    static int intersectionPoint(ListNode head1,ListNode head2){
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        while(cur1!=cur2){
            if(cur1==null){
                cur1=head2;
            }
            else{
                cur1 = cur1.next;
            }
            if(cur2 == null){
                cur2 = head1;
            }
            else{
                cur2 = cur2.next;
            }
        }
        return cur1.data;
    }

    public static void main(String[] args) {

        //First LinkedList
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode (5);

        ListNode head1 = n1;
        head1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        //Second LinkedList
        ListNode n11 = new ListNode(8);
        ListNode n22 = new ListNode(6);

        ListNode head2 = n11;
        head2.next = n22;
        n22.next = n4;

        System.out.println(intersectionPoint(head1,head2));


    }
}
