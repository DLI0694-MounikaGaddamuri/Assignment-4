class MergeSortedLL {
    static Node head1, head2;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node addAtEnd(Node head, int data) {
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

    void display(Node head) {
        Node temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();
    }

    public static Node mergeSortedLL(Node first, Node second) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (true) {
            if (first == null) {
                tail.next = second;
                break;
            } else if (second == null) {
                tail.next = first;
                break;
            }
            if (first.data <= second.data) {
                Node newNode = first;
                first = first.next;
                newNode.next = tail.next;
                tail.next = newNode;
            } else {
                Node newNode = second;
                second = second.next;
                newNode.next = tail.next;
                tail.next = newNode;
            }
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeSortedLL list1 = new MergeSortedLL();
        head1 = list1.addAtEnd(MergeSortedLL.head1, 5);
        head1 = list1.addAtEnd(MergeSortedLL.head1, 6);
        head1 = list1.addAtEnd(MergeSortedLL.head1, 7);
        head1 = list1.addAtEnd(MergeSortedLL.head1, 8);

        MergeSortedLL list2 = new MergeSortedLL();
        head2 = list2.addAtEnd(MergeSortedLL.head2, 1);
        head2 = list2.addAtEnd(MergeSortedLL.head2, 2);
        head2 = list2.addAtEnd(MergeSortedLL.head2, 3);
        head2 = list2.addAtEnd(MergeSortedLL.head2, 4);

        System.out.println("First Linked List: ");
        list1.display(MergeSortedLL.head1);
        System.out.println("Second Linked List: ");
        list1.display(MergeSortedLL.head2);

        System.out.println("Merged and Sorted Linked List");
       Node result= mergeSortedLL(head1,head2);
        list1.display(result);

    }
}

