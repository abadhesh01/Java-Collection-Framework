
package Comparable_VS_Comparator_Interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo02_Product_TreeSet {

    // Printing all the collection of products.
    public static void showAllProducts(Set<Product> products) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) 
            System.out.print(iterator.next());        
    }
    
    public static void main(String[] args) {

        // Creating a collection of products.
        Set<Product> products = new TreeSet<>();

        /*
            Note:
            -----
            As the default constructor of TreeSet class has been 
            called, the collection of products will be sorted on the 
            basis of compareTo() method present in Comparable<T> 
            interface implemented by Product class.
        */

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
