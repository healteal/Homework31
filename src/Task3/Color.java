package Task3;

public enum Color {
    RED("RED"), YELLOW("YELLOW"), WHITE("WHITE"), BLACK("BLACK");

    private final String color;
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
