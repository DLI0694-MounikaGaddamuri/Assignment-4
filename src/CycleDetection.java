import java.util.*;
public class CycleDetection {
    static Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp=temp.next;
        temp.next=newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean detectCycle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        CycleDetection list = new CycleDetection();
        list.addEnd(2);
        list.addEnd(4);
        list.addEnd(6);
        list.addEnd(8);
        list.addEnd(10);
        list.addEnd(2);

        list.display();

        System.out.println(list.detectCycle(head));

    }
}
