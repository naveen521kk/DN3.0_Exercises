package design_patterns.BuilderPatternExample;

// BuilderPatternTest.java
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Build a basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();
        System.out.println(basicComputer);

        // Build a Computer with all features
        Computer advancedComputer = new Computer.Builder("Intel i9", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();
        System.out.println(advancedComputer);

        // Build a Computer with some features
        Computer midRangeComputer = new Computer.Builder("AMD Ryzen 7", "12GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println(midRangeComputer);
    }
}
