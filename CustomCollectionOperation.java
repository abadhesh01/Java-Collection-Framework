
import java.util.Collection;

public class CustomCollectionOperation
 {
    public static void operateOn(Collection<String> collection)
    {
        // Printing the type of collection.
        System.out.println("\nCollection Type: " + collection.getClass().getName());


        // Sample elements to be inserted into the collection.
        String [] strings = new String[]{"Delta", "Alpha", "Charlie", "Bravo"};
        String elements = "[";
        for (String string : strings) {
            elements += string + ", ";
        }
        elements = elements.substring(0, elements.length() -2) + "]";
        System.out.println("\nSample elements to be inserted inside the collection:\n" 
        + "Elements: " + elements);


        // Inserting sample elements into collection.        
        System.out.println("\nInserting sample elements into collection.....");
        for (String string : strings) {
            collection.add(string);
        }


        // Checking insertion order.
        System.out.println("\nChecking  insertion order into collection.....");
        System.out.println("Elements: " + elements);
        System.out.println("Collection: " + collection);
        if(collection.toString().equals(elements))
          System.out.println("Insertion order is maintained.");
        else
          System.out.println("Insertion order is not maintained.");  

        
        // Adding null into the collection.
        System.out.println("\nAdding null into the collection.....");
        try 
        { 
            collection.add(null); 
            System.out.println("Collection: " + collection);
        } 
        catch (Exception e) 
        {System.out.println(e.getClass().getName() + " : " + e.getMessage());}
        
        
        // Adding duplicates into the collection.
        System.out.println("\nAdding duplicates into the collection.....");
        try
        { 
            for (String string : strings) {
                collection.add(new String(string));      
            } 
            System.out.println("Collection: " + collection);
        } 
        catch (Exception e) 
        {System.out.println(e.getClass().getName() + " : " + e.getMessage());}

        System.out.println();
    }

 }