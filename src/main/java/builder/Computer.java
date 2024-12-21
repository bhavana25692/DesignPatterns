package builder;

public class Computer {
    private String brand;
    private double ram;
    private int core;
    private String processor;

    public Computer(Builder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.core = builder.core;
        this.processor = builder.processor;
    }
    public static class Builder {
        private String brand;
        private double ram;
        private int core;
        private String processor;

        public Builder setRam(double ram) {
            this.ram = ram;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
