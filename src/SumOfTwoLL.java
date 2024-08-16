class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SumOfTwoLL{
    static Node head1,head2;

    Node addAtEnd(int data,Node head) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return newNode;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    void display(Node head){
        System.out.println("Linked List:");
        Node temp1=head;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
    }

    public Node function(Node head1,Node head2){
        Node t1=head1,t2=head2;
        Node dummyNode= new Node(-1);
        Node current=dummyNode;
        int carry=0;

        while(t1!=null && t2!=null){
            int sum=carry;
            if(t1!=null)    sum=sum+t1.data;
            if(t2!=null)    sum=sum+t2.data;
            Node newNode = new Node(sum%10);
            carry=sum/10;
            current.next=newNode;
            current=current.next;

            if(t1!=null)    t1=t1.next;
            if(t2!=null)    t2=t2.next;
        }
        if(carry!=0){
            Node newNode = new Node(carry);
            current.next=newNode;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        SumOfTwoLL list1 = new SumOfTwoLL();
        head1=list1.addAtEnd(1,head1);
        head1=list1.addAtEnd(2,head1);

        SumOfTwoLL list2 = new SumOfTwoLL();
        head2=list2.addAtEnd(1,head2);
        head2=list2.addAtEnd(2,head2);

        list1.display(head1);
        list1.display(head2);

        Node result=list1.function(head1,head2);
        list1.display(result);
    }
}
