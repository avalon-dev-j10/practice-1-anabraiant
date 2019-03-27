package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
        for (int i = 0; i < shapes.length; i++){
            shapes[i] = factory.getInstance();
        }

        for (Shape shape: shapes)
            System.out.println(shape.getClass() + "  = " + shape.getArea());
        
        float maxAreaShape = shapes[0].getArea();   //метод для определения только НАИБ.Площади без определения фигуры withoit CompateTo
        for (int j = 1; j < shapes.length; j++){
            if (shapes[j].getArea() > maxAreaShape)
                maxAreaShape = shapes[j].getArea();
        }
        System.out.println("Max Area = " + maxAreaShape);

        Shape maxAreaShape2 = shapes[0];                // метод для опр.Наиб площади и вида фигуры с CompateTo
        for (int z = 1; z < shapes.length; z++){
            if (maxAreaShape2.compareTo(shapes[z]) == -1)
                maxAreaShape2 = shapes[z];
        }
        System.out.println("Max Area of " + maxAreaShape2.getClass().getSimpleName() + " = " + maxAreaShape2.getArea());
    }
}
