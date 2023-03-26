import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo15_MapIteration {
    public static void main(String[] args) {

        // Creating a map and adding some sample elements to it.
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(null, null);
        map.put(1001, "Alpha");
        map.put(2002, "Bravo");
        map.put(3003, "Charlie");
        map.put(4004, "Delta");

        System.out.println("\nMap Type: " + map.getClass().getName());
        System.out.println("\nMap: " + map);

        // Generating a set of keys i.e. a key set.
        System.out.println("\nGenerating a set of keys.....");
        Set<Integer> keySet = map.keySet();
        System.out.println("Key Set Type: " + keySet.getClass().getName());
        System.out.println("Key Set: " + keySet);
        
        // Iterating through map using for-each loop and generated key set.
        System.out.println("\nIterating through map using for-each" + 
        " loop and generated key set.....");
        System.out.println("Key \t \t Value");
        System.out.println("--- \t \t -----");
        for (Integer integer : keySet) {
            System.out.println(integer + " \t \t " + map.get(integer));
        }

        // Iterating through map using java.util.Iterator and generated key set.
        System.out.println("\nIterating through map using java.util.Iterator" + 
        " and generated key set.....");
        System.out.println("Key \t \t Value");
        System.out.println("--- \t \t -----");
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
              Integer integer = iterator.next();
              System.out.println(integer + " \t \t " + map.get(integer));
        }

        System.out.println();
    }    
}
