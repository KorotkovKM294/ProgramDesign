package ru.sbt.kkm.design;

import org.junit.Test;
import ru.sbt.kkm.design.Figure;
import ru.sbt.kkm.design.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void getArea() throws Exception {
        double oneSide = 4;
        double secondSide = 5;
        Figure square = new Rectangle(oneSide, secondSide);
        double area = square.getArea();
        assertEquals(area, 20, 0);
    }

}