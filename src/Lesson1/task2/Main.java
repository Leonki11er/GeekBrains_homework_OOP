package Lesson1.task2;

public class Main {
    public static void main(String[] args) {

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Площадь прямоугольника по умолчанию = " + defaultRectangle.calculateArea(defaultRectangle.getHeight(),defaultRectangle.getWidth()));
        Rectangle rectangle = new Rectangle(10.0,20.0);
        System.out.println("Периметр заданного прямоугольника = " + rectangle.calculatePerimeter(rectangle.getHeight(),rectangle.getWidth()));
    }
}
