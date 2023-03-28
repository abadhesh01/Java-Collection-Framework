
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo17_LamdaMethods {
   public static void main(String[] args) {
    
      // Creating a list of integers.
      List<Integer> integers = new LinkedList<>();

      // Printing collection type.
      System.out.println("\nCollection Type: " + integers.getClass().getName() + "\n");

      // Adding 10 elemets (1 to 10) to it.
      for(int number = 1; number <= 10; number ++)
          integers.add(number);    

      /*
         -> Consumer<T> is a functional interface.

         -> Note: Functional interfaces have only one abstract method and they
            are used for writing lamda expressions from Java 8 and onwards.

         -> For more refer to: https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
      */    
      // The below lambda expression prints an java.lang.Integer type element provided to it. 
      Consumer<Integer> displayElements = obj -> System.out.print(obj + "->");    


      // Printing each and every element in the list of integers.
      // Method signature: default void forEach(Consumer<T> consumer)
      integers.forEach(displayElements); 


      /*
         -> Predicate<T> is a functional interface.

         -> Note: Functional interfaces have only one abstract method and they
            are used for writing lamda expressions from Java 8 and onwards.

         -> For more refer to: https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
      */ 
      // The below lambda expression returns 'true' if java.lang.Integer type element provided to it
      // is an even integer. Otherwise it returns 'false'.
      Predicate<Integer> removeAllEvenIntegers = obj -> { if (obj % 2 == 0)
                                                  return true;
                                                  return false; };   

      // Removing all the even integers from the list.                                            
      // Method signature: default boolean removeIf(Predicate<? super E> filter)
      integers.removeIf(removeAllEvenIntegers);

      System.out.println("\n\nAfter removing all the even integers.....\n");

      // Printing each and every element in the list of integers.
      // Method signature: default void forEach(Consumer<T> consumer)
      integers.forEach(displayElements); 
     
      System.out.println("\n");
   }    
}
