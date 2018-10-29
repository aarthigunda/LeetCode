package LinkedList;

/**
 * Construct a node in linked list having value and next pointer
 */
public class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
