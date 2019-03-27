package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class RectangleRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
        return new Rectangle(random_number.mathRandomMethod(), random_number.mathRandomMethod());
    }
}
