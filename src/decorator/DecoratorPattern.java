package decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        //Requirement 1
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        //New Requirement and should be no change in requirment 1
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}