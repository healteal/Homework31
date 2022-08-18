package Task3;

public class Auto {
    private String name;
    private int yearOfRelease;
    private double price;
    private Color color;
    private int engineVolume;

    public Auto(String name, int yearOfRelease, double price, Color color, int engineVolume) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", price=" + price +
                ", color=" + color +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
