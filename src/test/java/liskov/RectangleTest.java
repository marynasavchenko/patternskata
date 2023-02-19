package liskov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculateRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 4);
        double area = rectangle.calculateArea();

        assertEquals(8, area);
    }

    @Test
    void shouldCalculateSquareArea() {
        Rectangle rectangle = new Square(4);
        double area = rectangle.calculateArea();

        assertEquals(16, area);
    }

    @Test
    void shouldSetWeightOfRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.setWeight(6);
        assertEquals(2, rectangle.getHeight());
        assertEquals(6, rectangle.getWeight());

    }

    @Test
    void shouldSetSideOfSquare() {
        Rectangle square = new Square(4);
        square.setWeight(6);
        // different values, should not be happening
        assertEquals(6, square.getWeight());
        assertEquals(4, square.getHeight());
    }

}