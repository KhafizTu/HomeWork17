package shape;

public class Triangle extends Shape {
    int sideA;
    int sideB;
    int sideC;


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle() {
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }
}
