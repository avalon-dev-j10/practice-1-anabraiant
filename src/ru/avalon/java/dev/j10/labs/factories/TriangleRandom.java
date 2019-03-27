package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class TriangleRandom implements ShapeFactory {

    @Override
    public Shape getInstance() {
        

        return new Triangle(random_number.mathRandomMethod(), random_number.mathRandomMethod(), 
                random_number.mathRandomMethod());
    }
}
