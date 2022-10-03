class Node{
    int value;
    Node next;
    Node(int nodeValue){
        value=nodeValue;
    }
}
public class LinkedListExample {
    static Node head=null;
    public static void printLL(){
        Node run=head;
        while(run!=null){
            System.out.println(run.value+" ");
            run=run.next;
        }
        System.out.println();
    }
    static void insertAtEnd(int number){
        Node temp=new Node(number);
        if(head==null){
            head=temp;
        }else{
            Node run=head;
            while(run.next!=null){
                run=run.next;
            }
            run.next=temp;
        }
    }
    static void insertAtPos(int pos,int val){
        Node temp=new Node(val);
        if(pos==1){
            temp.next=head;
            head=temp;
        } else{
            Node run=head;
            for(int i=2;i<=pos-1;i++){
                run=run.next;
            }
            temp.next=run.next;
            run.next=temp;
        }
    }
    static void deletAtPos(int pos){
        if(pos==1){
            head=head.next;
        }else{
            Node run=head;
            for(int i=2;i<=pos-1;i++){
                run=run.next;
            }
            run.next=run.next.next;
        }
    }
    public static void main(String[] args) {
        insertAtEnd(9);
        insertAtEnd(8);
        insertAtEnd(5);
        printLL();
    //     insertAtPos(1,30);
    //     insertAtPos(2,35);
    //     insertAtPos(4,46);
    //     printLL();
    //     insertAtPos(2,49);
    // printLL();
    deletAtPos(3);
    printLL();

    }
}
