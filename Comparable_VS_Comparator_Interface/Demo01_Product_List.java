
package Comparable_VS_Comparator_Interface;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo01_Product_List {

    // Printing all the collection of products.
    public static void showAllProducts(List<Product> products) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) 
            System.out.print(iterator.next());        
    }

    public static void main(String[] args) {

        // Creating a collection of products.
        List<Product> products = new LinkedList<>();

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

        // Sorting the collection of products on the basis of compareTo() method
        // of Comparable<T> interface implemented by Product class.
        System.out.print("\n\nAfter sorting the collection of products " + 
        "on the basis of compareTo() \nmethod of Comparable<T> interface " +
        "implemented by Product class.....");
        Collections.sort(products);
        showAllProducts(products);

        // Lamda expression implmentation for compare() method of Comparator<T> 
        // interface for sorting the collection of products in the descending  
        // order of product id. 
        Comparator<Product> sortByDescendingProductId = (obj1, obj2) -> {

            long obj1Id = obj1.getId(); 
            long obj2Id = obj2.getId();
            
            if (obj1Id > obj2Id)
                return -1;

            if (obj1Id < obj2Id)
                return 1;    
            
            return 0;
        };

        // Lamda expression implmentation for compare() method of Comparator<T> 
        // interface for sorting the collection of products in the order of  
        // product name.
        Comparator<Product> sortByProductName;
        sortByProductName = (obj1, obj2) -> obj1.getName().compareTo(obj2.getName());

        // Lamda expression implmentation for compare() method of Comparator<T> 
        // interface for sorting the collection of products in the order of 
        // product type.
        Comparator<Product> sortByProductType;
        sortByProductType = (obj1, obj2) -> obj1.getType().compareTo(obj2.getType());

        // Sorting the collection of products on the 
        // basis of descending order of product id.
        System.out.print("\n\nSorting the collection of products on the" +
        "\nbasis of descending order of product id.....");
        Collections.sort(products, sortByDescendingProductId);
        /* For more about Collections class refer:
        https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html */
        showAllProducts(products);

        // Sorting the collection of products  
        // in the order of product name.
        System.out.print("\n\nSorting the collection of products in the " +
        "order of product name.....");
        Collections.sort(products, sortByProductName);
        /* For more about Collections class refer:
        https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html */
        showAllProducts(products);  

        // Sorting the collection of products
        // in the order of product type.
        System.out.print("\n\nSorting the collection of products in the " +
        "order of product type.....");
        Collections.sort(products, sortByProductType);
        /* For more about Collections class refer:
        https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html */
        showAllProducts(products);

        System.out.println("\n");
    }    
}
