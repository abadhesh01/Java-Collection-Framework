
import java.util.Stack;

public class Demo11_Stack {
   public static void main(String[] args) {

      /*
         Note:
         -----
         -> java.util.Stack is a LIFO (Last In First Out) data structure i.e
            the element inserted last will be removed first.

         -> push() method is used to insert elements into the stack.
         
         -> pop() method is used to remove last inserted element from the stack.
      */
      
      Stack<Integer> integers = new Stack<>();

      System.out.println("\nCollection Type: " + integers.getClass().getName());
      
      System.out.println("\nstack: " + integers);

      // Pushing elements into the stack.
      System.out.println("\nPushing elements into the stack.....");
      System.out.println(integers.push(1001));
      System.out.println(integers.push(2002));
      System.out.println(integers.push(3003));
      System.out.println(integers.push(4004));
      System.out.println(integers.push(5005));
      System.out.println(integers.push(6006));
      System.out.println(integers.push(7007));
      System.out.println("stack: " + integers);

      // Popping elements out of the stack.
      System.out.println("\nPopping elements out of the stack.....");
      System.out.println(integers.pop());
      System.out.println(integers.pop());
      System.out.println(integers.pop());
      System.out.println(integers.pop());
      System.out.println("stack: " + integers + "\n");

   }    
}
