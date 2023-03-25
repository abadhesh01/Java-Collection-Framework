
import java.util.ArrayDeque;
import java.util.Deque;

public class Demo13_Deque {
  public static void main(String[] args) {

    /*
       Note:
       -----
       -> java.util.Deque interface inherits java.util.Queue interface 
          and it is a double ended queue i.e. elements can be added or 
          removed from both the ends of the deque. 

       -> pollLast() method is used to remove an element 
          from the ending point.
       
       -> addFirst(E e) method is used add an element at 
          the starting point of the deque.
    */
     
     Deque<Integer> integers = new ArrayDeque<>();

     System.out.println("\nCollection Type: " + integers.getClass().getName());
     
     System.out.println("\ndeque: " + integers);

     // Inserting some elements into the deque.
     System.out.println("\nInserting some elements into the deque.....");
     integers.add(-1111);
     integers.add(2002);
     integers.add(3003);
     integers.add(4004);
     integers.add(-5555);
     System.out.println("queue: " + integers);

     // Removing the first element of the deque.
     System.out.println("\nRemoving the first element of the deque.....");
     System.out.println(integers.poll());
     System.out.println("queue: " + integers);

     // Removing the last element of the deque.
     System.out.println("\nRemoving the last element of the deque.....");
     System.out.println(integers.pollLast());
     System.out.println("queue: " + integers);

     // Inserting an element at beginning of the queue.
     System.out.println("\nInserting an element at beginning of the queue.....");
     integers.addFirst(1001);
     System.out.println("queue: " + integers);

     // Inserting an element at ending of the queue.
     System.out.println("\nInserting an element at ending of the queue.....");
     integers.add(5005);
     System.out.println("queue: " + integers + "\n");
     
  }    
}
