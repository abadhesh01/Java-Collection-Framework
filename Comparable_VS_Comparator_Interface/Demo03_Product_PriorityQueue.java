
package Comparable_VS_Comparator_Interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo03_Product_PriorityQueue {
    public static void main(String[] args) {

        // Creating a collection of products.
        Queue<Product> products = new PriorityQueue<>();

        // Printing collection type.
        System.out.println("\nCollection Type: " + products.getClass().getName());
        
        // Adding some products to it.
        System.out.println("\nAfter adding some products.....");
        products.add(new Product(4004, "GIGABYTE GeForce GT 710", "GPU")); 
        products.add(new Product(1001, "Intel Core i5 10 Gen", "CPU"));
        products.add(new Product(3003, "Logitech M170", "Computer Mouse"));
        products.add(new Product(2002, "Lenovo ThinkPad L470", "Notebook Computer")); 
        System.out.println("Products : " + products);

        // Adding some duplicate products to it.
        System.out.println("\nAfter adding some duplicate products.....");
        products.add(new Product(2002, "Lenovo ThinkPad L470", "Notebook Computer")); 
        products.add(new Product(3003, "Logitech M170", "Computer Mouse"));
        System.out.println("Products : " + products);

        System.out.println();
    }     
}
