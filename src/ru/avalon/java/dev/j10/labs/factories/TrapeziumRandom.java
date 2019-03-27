package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;

public class TrapeziumRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
      
        return new Trapezium(random_number.mathRandomMethod(), random_number.mathRandomMethod(),
        random_number.mathRandomMethod(), random_number.mathRandomMethod(),
        random_number.mathRandomMethod());
    }
}
