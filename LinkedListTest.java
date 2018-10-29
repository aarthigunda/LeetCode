package LinkedList;

/**
 * Created by AG044529 on 3/4/2018.
 */
public class LinkedListTest {

    public static void main(String[] args){
        Node head = new Node("123");
        head.setNext(new Node("345"));
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(head);
        Node forInsertion = new Node("444");
        //singlyLinkedList.insertAtBeginning(forInsertion);
        //singlyLinkedList.insertAtEnd(forInsertion);
        singlyLinkedList.insertAtMiddle(forInsertion, 2);
        singlyLinkedList.printAllNodes(singlyLinkedList);
    }



}
