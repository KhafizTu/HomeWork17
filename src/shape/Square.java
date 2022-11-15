package shape;

public class Square extends Shape {
    int sideA;
    int sideB;
    int sideC;
    int sideD;

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

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
    }

    public Square() {
    }

    @Override
    public double getPerimeter() {
        return (sideA * 4);
    }
}
