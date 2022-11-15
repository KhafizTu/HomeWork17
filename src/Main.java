import shape.*;

public class Main {
    public static void main(String[] args) {

        Paralellepiped paralellepiped = new Paralellepiped();
        paralellepiped.setHeight(3);
        paralellepiped.setLength(4);
        paralellepiped.setWidth(5);
        System.out.println("Паралеллепипеттин периметири: " + paralellepiped.getPerimeter());

        Triangle triangle = new Triangle();
        triangle.setSideA(7);
        triangle.setSideB(9);
        triangle.setSideC(5);
        System.out.println("Уч бурчтуктун периметири:" + triangle.getPerimeter());

        Square square = new Square();
        square.setSideA(8);
        System.out.println("Квадраттын периметири: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(4);
        rectangle.setSideB(6);
        System.out.println("Тикбурчтуктун периметири: " + rectangle.getPerimeter());

        Circle circle = new Circle();
        circle.setRadius(6);
        System.out.println("Айлананы узундугу: " + circle.getPerimeter());


    }
}