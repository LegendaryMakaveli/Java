import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    @Test
    public void TestRectangle() {
        Rectangle newRectangle = new Rectangle();
        newRectangle.setLength(5);
        newRectangle.setWidth(4);

        assertEquals(5, newRectangle.getLength());
        assertEquals(4, newRectangle.getWidth());

    }
    @Test
    public void TestArea() {
        assertEquals(20, Rectangle.area(5, 4));
    }

    @Test
    public void TestPerimeter() {
        assertEquals(18, Rectangle.perimeter(5, 4));
    }

}
