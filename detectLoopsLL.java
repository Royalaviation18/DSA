//detecting loops in ll

class LNNode{
    int data;
    LNNode next;

    LNNode(int data){
        this.data = data;
    }

    public static void traverse(LNNode head){
        if(head == null){
            System.out.println("\nThe list is empty");
        }
        else{
            LNNode temp = head;

            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static boolean detectLoops(LNNode head){
        LNNode slow = head;
        LNNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next;

            if(fast == slow){
                break;
            }
        }
        if(fast == slow){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        LNNode n1 = new LNNode(10);
        LNNode n2 = new LNNode(20);
        LNNode n3 = new LNNode(30);
        LNNode n4 = new LNNode(40);
        LNNode n5 = new LNNode(50);

        LNNode head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
    
        System.out.println("\nTraversing through LL\n");
        // traverse(head); 
        System.out.println(detectLoops(head));
        
    }
}
