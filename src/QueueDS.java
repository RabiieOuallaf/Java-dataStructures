import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    // Queue is a data structure , FIFO - First in First out (like a line of people)
    // is a collection designed for holding elements prior to proccessing Linear DS
    // Add : enqueue, offer()
    // Remove : dequeue, poll()
    QueueDS(){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Rabie"); // Rabie is the first element in our queue now , see he will be the first served
        queue.offer("Anas");
        queue.offer("Mehdi");
        queue.offer("Adam");

        queue.poll(); // Remove rabie
        System.out.println(queue.peek()); // The head now is Anas


    }
}
