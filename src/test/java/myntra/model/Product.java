package myntra.model;

// Class representing a Product with its details and functionality to compare by discount percentage.
public class Product implements Comparable<Product> {
    private String name;  // Name of the product
    private String link;  // Link to the product
    private double originalPrice;  // Original price of the product
    private double discountedPrice;  // Discounted price of the product
    private int discountPercentage;  // Discount percentage on the product

    // Constructor to initialize all fields of the Product class
    public Product(String name, String link, double originalPrice, double discountedPrice, int discountPercentage) {
        this.name = name;
        this.link = link;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discountPercentage = discountPercentage;
    }

    // Overriding toString method to provide a meaningful string representation of a Product
    @Override
    public String toString() {
        return String.format("Name: %s\nOriginal Price: %.2f\nDiscounted Price: %.2f\nDiscount: %d%%\nLink: %s",
                name, originalPrice, discountedPrice, discountPercentage, link);
    }

    // Overriding compareTo method to compare Products by discount percentage in descending order
    @Override
    public int compareTo(Product other) {
        return other.discountPercentage - this.discountPercentage;
    }
}
