package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    public float r, centrX, centrY, circleLength, circleArea;
    

    
   

    public Circle(float r) {
        this.r = r;
        circleLength = 2*r*Pi;
        circleArea = 2*r*r;
    }
    
  
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getLength() {
        return circleLength;
    }

    @Override
    public float getArea() {
        return circleArea;
    }

    @Override
    public float getX() {
        return centrX;
    }

    @Override
    public float getY() {
        return centrY;
    }
}