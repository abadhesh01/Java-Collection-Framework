import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo16_MapSorting {

    // Printing each element of provided stream.
    public static void iterateThroughStream(Iterator<Map.Entry<Integer, String>> iterator)
    {
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> element = iterator.next();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        
        // Creating a map and adding some sample elements to it.
        Map<Integer, String> map = new HashMap<>();

        //map.put(null, null); // Causes java.lang.NullPointerException.
        map.put(1001, "Delta");
        map.put(2002, "Alpha");
        map.put(3003, "Charlie");
        map.put(4004, "Bravo");

        System.out.println("\nMap Type: " + map.getClass().getName());
        System.out.println("\nMap: " + map);

        // Converting map into entry set.
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        
        // Converting entry set into stream of java.util.Map.Entry<E, T>.
        Stream<Map.Entry<Integer, String>> stream = entrySet.stream();
        
        // Sorting stream elements by key in the ascending order.
        System.out.println("\nSorting stream elements by key in the ascending order....."); 
        Stream<Map.Entry<Integer, String>> sortedElements = stream.sorted(Map.Entry.comparingByKey());  
        /* For more about java.util.Map.Entry refer to: 
        https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html */  
        iterateThroughStream(sortedElements.iterator());

        // Sorting stream elements by key in the descending order.
        System.out.println("\nSorting stream elements by key in the descending order....."); 
        stream = entrySet.stream(); // Required
        sortedElements = stream.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));    
        iterateThroughStream(sortedElements.iterator());

        // Sorting stream elements by value in the ascending order.
        System.out.println("\nSorting stream elements by value in the ascending order....."); 
        stream = entrySet.stream(); // Required
        sortedElements = stream.sorted(Map.Entry.comparingByValue());    
        iterateThroughStream(sortedElements.iterator());

        // Sorting stream elements by value in the descending order.
        System.out.println("\nSorting stream elements by value in the descending order....."); 
        stream = entrySet.stream(); // Required
        sortedElements = stream.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));    
        iterateThroughStream(sortedElements.iterator());

        System.out.println();
    }
}
