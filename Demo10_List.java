
import java.util.List;
import java.util.Stack;

public class Demo10_List {
  public static void main(String[] args) {

    /*
       Note:
       ----- 
       -> All classes implementing java.util.List interface only can insert 
          elements at any position. 
       
       -> java.util.List interface provides get() method for
          index based access of elements.   
    */

     List<Integer> integers = new Stack<>();
     integers.add(-11);
     integers.add(2);
     integers.add(0);
     integers.add(4);
     integers.add(-55);

     String collectionType =  integers.getClass().getName();
     System.out.println("\nCollection Type: " + collectionType);

     System.out.println("\ncollection: " + integers);

     // Removing an element at the middle.
     System.out.println("\nRemoving an element at the middle.....");
     integers.remove(integers.size() / 2);
     System.out.println("collection: " + integers);

     // Removing an element at the beginning.
     System.out.println("\nRemoving an element at the beginning.....");
     integers.remove(0);
     System.out.println("collection: " + integers);  
     
     // Removing an element at the ending.
     System.out.println("\nRemoving an element at the ending.....");
     integers.remove(integers.size() -1);
     System.out.println("collection: " + integers);

     // Inserting an element at the middle.
     System.out.println("\nInserting an element at the middle.....");
     integers.add(integers.size() -1, 3);
     System.out.println("collection: " + integers);

     // Inserting an element at the beginning.
     System.out.println("\nInserting an element at the beginning.....");
     integers.add(0, 1);
     System.out.println("collection: " + integers);

     // Inserting an element at the ending.
     System.out.println("\nInserting an element at the ending.....");
     integers.add(5);
     System.out.println("collection: " + integers);

     // Accessing elements by indices.
     System.out.println("\nAccessing elements by indices.....");
     int size = integers.size();
     System.out.println("Index \t \t Element");
     System.out.println("----- \t \t -------");
     for (int index = 0; index < size; index ++)
          System.out.println(index + " \t \t "
          + integers.get(index) /*E get(int index)*/);
     
      System.out.println();
    }    

}
