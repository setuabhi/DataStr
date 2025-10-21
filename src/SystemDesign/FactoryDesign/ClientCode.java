package SystemDesign.FactoryDesign;

public class ClientCode {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        // Get an object of Circle and call its draw method
        Interface shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Interface shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

    }
}
