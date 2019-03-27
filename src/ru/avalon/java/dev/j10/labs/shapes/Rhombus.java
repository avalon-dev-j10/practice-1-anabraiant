package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus implements Polygon{
    public float d1, d2, side1,side2, rhomPerimetr, rhomArea;

    /*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Rhombus(float d1, float d2, float side1, float side2) {
        this.d1 = d1;
        this.d2 = d2;
        this.side1 = side1;
        this.side2 = side2;
        rhomPerimetr = 2* (side1 +  side2);
        rhomArea = (d1*d2)/2;
    }

    @Override
    public float getPerimeter() {
        return rhomPerimetr;
    }

    @Override
    public float getArea() {
        return rhomArea;
    }
}

