//Creating,inserting, traversing and deleting operations performed on a linkedlist in java

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
    }
    
    
    static void delete(Node head,int pos){
        if(pos == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    
    static void insert(int data,Node head,int pos){
       Node newNode = new Node(data);
       if(pos == 0){
           newNode.next = head;
           head = newNode;
           return;
       }
       Node prev = head;
       for(int i=0;i<pos-1;i++){
           prev = prev.next;
       }
       newNode.next = prev.next;
       prev.next=  newNode;
    }

    
    static void traverse(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public static void main(String [] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        
        //traversing through the LinkedList 
        traverse(head);
        
        //insertion
        System.out.println("\nInserting a data....");
        insert(35,head,3);
        System.out.println("\nTraversing through the linkedlist again....\n");
        traverse(head);
        
        //deletion
        System.out.println("\nDeleting a data....");
        delete(head,3);
        System.out.println("\nTraversing through the linkedlist again....\n");
        traverse(head);
    }
}

