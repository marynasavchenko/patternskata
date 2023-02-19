package liskov;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void setSide(double newSide) {
        this.height = newSide;
        this.weight = newSide;
    }
}
