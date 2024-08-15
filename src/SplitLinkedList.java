class LinkedList{
    Node head,head2;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addAtEnd(int data){
        Node newNode = new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void display(){
        System.out.println("Linked List 1");
        Node temp1=head;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
        System.out.println();
        System.out.println("Linked List 2");
        Node temp2=head2;
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
    }

    public int length(){
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public void splitLL() {
        int len = length();
        System.out.println(len);
        int mid = 0;
        if (len % 2 == 0)
            mid = len / 2;
        else
            mid=(len/2)+1;

        Node temp=head;
        head2=head;
        int i=1;
        while(i<mid){
            temp=temp.next;
            head2=head2.next;
            i++;
        }
        head2=head2.next;
        temp.next=null;
    }
}


public class SplitLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        list.addAtEnd(4);
        list.addAtEnd(5);
        list.addAtEnd(6);
        list.addAtEnd(7);

       // list.display();

        list.splitLL();

        list.display();
    }
}
