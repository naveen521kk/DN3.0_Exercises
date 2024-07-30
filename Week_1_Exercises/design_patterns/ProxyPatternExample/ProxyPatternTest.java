package design_patterns.ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create proxy image objects
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        Image image3 = new ProxyImage("image3.jpg");

        // Display the images
        System.out.println("First display:");
        image1.display(); // Will load and display

        System.out.println("\nSecond display:");
        image1.display(); // Will only display, no loading

        System.out.println("\nDisplay other images:");
        image2.display(); // Will load and display
        image3.display(); // Will load and display
    }
}
