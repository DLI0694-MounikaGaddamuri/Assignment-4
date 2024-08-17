import java.util.HashSet;

class LinkedList3 {
    Node head, head2;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();
    }

    public void removeDuplicates(){
        HashSet<Integer> hs = new HashSet<>();

        Node current=head;
        Node prev=null;
        while(current!=null){
            int value=current.data;
            if(hs.contains(value))
                prev.next=current.next;
            else{
                hs.add(value);
                prev=current;
            }
            current=current.next;
        }
    }
}


public class RemoveDuplicatesFromLL {
    public static void main(String[] args) {

        LinkedList3 list = new LinkedList3();
        list.addAtEnd(1);
        list.addAtEnd(42);
        list.addAtEnd(7);
        list.addAtEnd(42);
        list.addAtEnd(1);

        list.display();

        list.removeDuplicates();

        list.display();
    }
}
