package LinkedList;

/**
 * Created by AG044529 on 3/4/2018.
 */
public class SinglyLinkedList {

    public Node head;


    public SinglyLinkedList (Node head){
        this.head = head;

    }

    public Node getHead() {
        return head;
    }

    public void setHead(final Node head) {
        this.head = head;
    }


    public void insertAtBeginning(Node node) {
        if (head == null){
            System.out.println("No nodes in the list");
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public void insertAtEnd(Node node) {
        if (head == null){
            System.out.println("No nodes in the list");
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
            node.next = null;
        }
    }

    public void insertAtMiddle(Node node, int position) {
        if (head == null){
            System.out.println("No nodes in the list");
        }
        else {
            Node current = head;
            int count = 1;
            while (current.next != null && !(position-1 == count)) { // condition for position and length
                current = current.next;
                count++;
            }
            Node temp = current.next;
            current.next = node;
            node.setNext(temp);
            }
    }

    public void printAllNodes(SinglyLinkedList singlyLinkedList) {
        if (singlyLinkedList == null) {
            System.out.println("No Nodes in the list");
        }
        else {
            Node curr = singlyLinkedList.getHead();
            while (curr != null) {
                System.out.println(curr.getValue());
                curr = curr.getNext();
            }
        }
    }
}

