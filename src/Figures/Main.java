package Figures;

public class Main {
    public static void main(String[] args) {
        Figure figure;

        Triangle triangle = new Triangle(10,6);
        System.out.println(triangle);
        System.out.println(triangle.getArea());

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());

        figure = triangle;
        System.out.println(figure.getArea());

        figure = rectangle;
        System.out.println(figure.getArea());

        System.out.println(figure.calculateArea(rectangle));
    }
}
