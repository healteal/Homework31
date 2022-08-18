package Task4;

public class TV {
    private String name;
    private int yearOfRelease;
    private double price;
    private double diagonal;
    private Brand brand;

    public TV(String name, int yearOfRelease, double price, double diagonal, Brand brand) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.diagonal = diagonal;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", brand=" + brand +
                '}';
    }
}
