
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo12_Queue {
   public static void main(String[] args) {

      /*
          Note:
          -----
          -> java.util.Queue is a FIFO (First In First Out) data structure i.e
             the element inserted first will be removed first.

          -> Both peek() and element() methods are used to retrive the
             head of the queue but, the only difference is for empty 
             queue peek() returns null while element() throws  an
             RuntimeException.

          -> Both poll() and remove() methods are used to remove the
             head of the queue but, the only difference is for empty 
             queue poll() returns null while remove() throws  an
             RuntimeException.   
      */
    
      Queue<Integer> integers = new PriorityQueue<>();
      
      System.out.println("\nCollection Type: " + integers.getClass().getName());
      
      System.out.println("\nqueue: " + integers);

      // Inserting some elements into the queue.
      System.out.println("\nInserting some elements into the queue.....");
      integers.add(1001);
      integers.add(2002);
      integers.add(3003);
      integers.add(4004);
      integers.add(5005);
      System.out.println("queue: " + integers);

      // Retriving element at the peek of the queue.
      System.out.println("\nRetriving element at the peek of the queue.....");
      System.out.println(integers.peek());
      System.out.println("queue: " + integers);

      // Removing element at the peek of the queue.
      System.out.println("\nRemoving element at the peek of the queue.....");
      System.out.println(integers.poll());
      System.out.println("queue: " + integers);

      // Retriving element at the peek of the queue.
      System.out.println("\nRetriving element at the peek of the queue.....");
      System.out.println(integers.element());
      System.out.println("queue: " + integers);

      // Removing element at the peek of the queue.
      System.out.println("\nRemoving element at the peek of the queue.....");
      System.out.println(integers.remove());
      System.out.println("queue: " + integers + "\n");
   }    
}
