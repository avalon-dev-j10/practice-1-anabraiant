package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class CircleRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
        return new Circle(random_number.mathRandomMethod());
    }
}
