package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium implements Polygon{
    public float base1, base2, h, side1, side2, trapPerimetr, trapArea;

    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Trapezium(float base1, float base2, float h, float side1, float side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.h = h;
        this.side1 = side1;
        this.side2 = side2;
        trapPerimetr = base1 + base2 + side1 + side2;
        trapArea = (base1 + base2)/2;
    }

    @Override
    public float getPerimeter() {
        return trapPerimetr;
    }

    @Override
    public float getArea() {
        return trapArea;
    }
    
}

