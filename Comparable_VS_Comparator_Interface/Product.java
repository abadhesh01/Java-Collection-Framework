
package Comparable_VS_Comparator_Interface;

public class Product implements Comparable<Product> {
    
    private long id;
    private String name;
    private String type;

    // Getters and Setters.
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    // Default Constructor.
    public Product() {}

    // Parameterized Constructor.
    public Product(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // To String.
    @Override
    public String toString() {
        return "\nProduct [id=" + id + ", name=" + name + ", type=" + type + "]";
    }
    @Override
    public int compareTo(Product product) {
        
        if (this.id > product.getId())
            return -1;

        if (this.id < product.getId())
            return 1;
    
        return 0;
    }
}
