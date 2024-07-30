package ex2;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Shirt", "Clothing"),
                new Product("P004", "Book", "Books"),
                new Product("P005", "Shoes", "Footwear")
        };

        // Linear search
        Product result1 = LinearSearch.linearSearch(products, "Smartphone");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Binary search
        Product result2 = BinarySearch.binarySearch(products, "Smartphone");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
