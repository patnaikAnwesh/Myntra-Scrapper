package myntra.model;



public class Product implements Comparable<Product> {
    private String name;
    private String link;
    private double originalPrice;
    private double discountedPrice;
    private int discountPercentage;

    public Product(String name, String link, double originalPrice, double discountedPrice, int discountPercentage) {
        this.name = name;
        this.link = link;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(other.discountPercentage, this.discountPercentage);
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nOriginal Price: ₹%.2f%nDiscounted Price: ₹%.2f%nDiscount: %d%%%nLink: %s%n",
                name, originalPrice, discountedPrice, discountPercentage, link);
    }
}