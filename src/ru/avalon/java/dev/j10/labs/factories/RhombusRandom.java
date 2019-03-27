package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Rhombus;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class RhombusRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
        return new Rhombus(random_number.mathRandomMethod(), random_number.mathRandomMethod(), 
        random_number.mathRandomMethod(), random_number.mathRandomMethod());
    }
}
