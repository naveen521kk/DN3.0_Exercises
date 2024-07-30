package design_patterns.BuilderPatternExample;

// Computer.java
public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage
                + ", GraphicsCard=" + (hasGraphicsCard ? "Yes" : "No")
                + ", Bluetooth=" + (hasBluetooth ? "Yes" : "No") + "]";
    }

    public static class Builder {
        private final String CPU; // Mandatory
        private final String RAM; // Mandatory
        private String storage = ""; // Optional
        private boolean hasGraphicsCard = false; // Optional
        private boolean hasBluetooth = false; // Optional

        // Constructor with mandatory parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter for optional storage
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // Setter for optional graphics card
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        // Setter for optional Bluetooth
        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method to create a Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
