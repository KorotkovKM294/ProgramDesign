package ru.sbt.kkm.design;

import org.junit.Test;
import ru.sbt.kkm.design.Figure;
import ru.sbt.kkm.design.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void getArea() throws Exception {
        double ground = 4;
        double height = 5;
        Figure triangle = new Triangle(ground, height);
        double area = triangle.getArea();
        assertEquals(area, 10, 0);
    }

}