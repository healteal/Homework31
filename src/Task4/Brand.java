package Task4;

public enum Brand {
    SAMSUNG("SAMSUNG"), LG("LG"), AOC("AOC");

    private final String brand;

    Brand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
