package shape;

import static java.lang.Math.PI;

public class Circle extends Shape {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {}

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
