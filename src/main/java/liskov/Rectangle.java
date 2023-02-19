package liskov;

public class Rectangle {
    protected double height;

    protected double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateArea() {
        return height * weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}