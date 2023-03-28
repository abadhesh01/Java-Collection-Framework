
package Comparable_VS_Comparator_Interface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo06_Product_PriorityQueue {

    // Printing all the collection of products.
    public static void showAllProducts(Queue<Product> products) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) 
            System.out.print(iterator.next());        
    }
    
    public static void main(String[] args) {

        // Lamda expression implmentation for compare() method of Comparator<T> 
        // interface for sorting the collection of products in the order of product id. 
        Comparator<Product> sortByProductId = (obj1, obj2) -> {

            long obj1Id = obj1.getId(); 
            long obj2Id = obj2.getId();
            
            if (obj1Id > obj2Id)
                return 1;

            if (obj1Id < obj2Id)
                return -1;    
            
            return 0;
        };

        // Creating a collection of products by passing Comparator<T> interface
        // implementation as an arguement through PriorityQueue constructor.
        Queue<Product> products = new PriorityQueue<>(sortByProductId);

        // Printing collection type.
        System.out.println("\nCollection Type: " + products.getClass().getName());
        
        // Adding some products to it.
        System.out.print("\nAfter adding some products.....");
        products.add(new Product(4004, "GIGABYTE GeForce GT 710", "GPU")); 
        products.add(new Product(1001, "Intel Core i5 10 Gen", "CPU"));
        products.add(new Product(3003, "Logitech M170", "Computer Mouse"));
        products.add(new Product(2002, "Lenovo ThinkPad L470", "Notebook Computer")); 
        showAllProducts(products);

        // Adding some duplicate products to it.
        System.out.print("\n\nAfter adding some duplicate products.....");
        products.add(new Product(2002, "Lenovo ThinkPad L470", "Notebook Computer")); 
        products.add(new Product(3003, "Logitech M170", "Computer Mouse"));
        showAllProducts(products);

        System.out.println("\n");
    }     
}
