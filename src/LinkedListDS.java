import java.util.LinkedList;

public class LinkedListDS {
    // LinkedList is a data structre where each element know about where's the next element (Node) [DATA|ADDRESS] -> [DATA|ADDRESS]
    // DoubleLinkedList is where an element knows where the previous and the next elements are (Nodes) [ADDRESS | DATA | ADDRESS] <-> [ADDRESS | DATA | ADDRESS]
    // LinkedLists are a better choice when it comes to deletion or insertion of an element O(1) comparing to arrays O(N)
    LinkedListDS() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.add(4,"R");
        System.out.println(linkedList);

        // Some other beneficial methods
        linkedList.peekFirst();
        linkedList.peekLast();

        linkedList.addFirst("0"); // Ad an element as the head of the linked list
        linkedList.addLast("S"); // Ad an element as the till of the linked list

        linkedList.remove("R");
        System.out.println(linkedList);



    }
}
