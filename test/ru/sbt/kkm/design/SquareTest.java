package ru.sbt.kkm.design;

import org.junit.Test;
import ru.sbt.kkm.design.Figure;
import ru.sbt.kkm.design.Square;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void getArea() throws Exception {
        double side = 4;
        Figure square = new Square(side);
        double area = square.getArea();
        assertEquals(area, 16, 0);
    }
}