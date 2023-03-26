import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo14_Map {

    /*
        -----------------------
        java.util.Map Interafce
        -----------------------

        -> A map is a key and value pair where key is unique.
           Each key and value pair is called as an entry.
           
        -> A map allows duplicate values but, duplicate keys are not allowed.   
        
        -> It's implementations are available in JAVA through java.util.Map interface.

        -> Following are some implementations of java.util.Map interface:
        [1] java.util.HashMap
            * Hash table based implementation of the java.util.Map interface.
            * Adding duplicate key will reset the value for the key.
            * Insertion order is not maintained.
            * Null key is allowed.
            * Null values are allowed.
        [2] java.util.LinkedHashMap
            * Hash table and linked list implementation of the java.util.Map interface, 
              with predictable iteration order.
            * It inherits java.util.HashMap.
            * Adding duplicate key will reset the value for the key.
            * Inserion order is maintained.
            * Null key is allowed.
            * Null values are allowed.
        [3] java.util.TreeMap
            * A Red-Black tree based implementation. 
            * It implements java.util.SortedMap interface which is 
              the child interface of java.util.Map interface.
            * Adding duplicate key will reset the value for the key.
            * Elements are sorted in the ascending order of keys.
            * Null key is not allowed. Adding null key will result in java.lang.NullPointerException.
            * Null values are allowed.
        
        -> For more refer:
           Map: https://www.javatpoint.com/java-map
           Javadoc for Map: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
           Javadoc for HashMap: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
           Javadoc for LinkedHashMap: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
           Javadoc for SortedMap: https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html
           Javadoc for TreeMap: https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
           Javadoc for Map.Entry: https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html

    */

    public static void operateOnMap(Map<Integer, String> map)
    {

        System.out.println("\nMap Type: " + map.getClass().getName());

        String value = "Alpha";
        String value2 = "Bravo";
        String value3 = "Charlie";
        String value4 = "Delta";

        // Inserting sample elements into map.
        map.put(1001, value);
        map.put(2002, value2);
        map.put(3003, value3);
        map.put(4004, value4);
        System.out.println("collection: " + map.toString());

        // After adding duplicate keys.
        System.out.println("After adding duplicate keys.....");
        map.put(1001, value4);
        map.put(2002, value3);
        map.put(3003, value2);
        map.put(4004, value);
        System.out.println("collection: " + map.toString());

        // After adding duplicate values and a null value.
        System.out.println("After adding duplicate values and a null value.....");
        map.put(9009, null); 
        map.put(8008, value4);
        map.put(7007, value3);
        map.put(6006, value2);
        map.put(5005, value);
        System.out.println("collection: " + map.toString());

        // After adding a null key.
        System.out.println("After adding a null key.....");
        try {
            map.put(null, "Null Key Value");
        } 
        catch (Exception e) {System.out.println(e + " : " + e.getMessage());}
        System.out.println("collection: " + map.toString());

        System.out.println();
    }

   public static void main(String[] args) {
      operateOnMap(new HashMap<>());
      operateOnMap(new LinkedHashMap<>());
      operateOnMap(new TreeMap<>());
   }    
}
