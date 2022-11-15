package shape;

public class Paralellepiped extends Shape {
    int height;
    int length;
    int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Paralellepiped() {
    }

    @Override
    public double getPerimeter() {
        return (4 * (height + length + width));
    }
}
