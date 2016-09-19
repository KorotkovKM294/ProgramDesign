package ru.sbt.kkm.design;

import org.junit.Test;
import ru.sbt.kkm.design.Circle;
import ru.sbt.kkm.design.Figure;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void getArea() throws Exception {
        double radius = 4;
        Figure circle = new Circle(4);
        double area = circle.getArea();
        assertEquals(area, 50.26, 0.006);
    }

}