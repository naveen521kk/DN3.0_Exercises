package ex1;

import java.util.HashMap;

public class InventoryManagement {
    private HashMap<String, Product> inventory;

    public InventoryManagement() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added: " + product);
        }
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            Product removedProduct = inventory.remove(productId);
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to display the inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

        // Adding products
        Product product1 = new Product("P001", "Product 1", 100, 29.99);
        Product product2 = new Product("P002", "Product 2", 50, 59.99);

        inventoryManagement.addProduct(product1);
        inventoryManagement.addProduct(product2);

        // Updating a product
        Product product2Updated = new Product("P002", "Product 2 Updated", 75, 49.99);
        inventoryManagement.updateProduct(product2Updated);

        // Deleting a product
        inventoryManagement.deleteProduct("P001");

        // Displaying inventory
        inventoryManagement.displayInventory();
    }
}
