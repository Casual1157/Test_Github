package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        Circle circle = new Circle(5, 6, 7);
        Triangle triangle = new Triangle(8, 9, 10, 11, 12, 13);

        Group group = new Group();
        group.addShape(rectangle);
        group.addShape(circle);
        group.addShape(triangle);

        System.out.println("Total Area: " + group.calculateTotalArea());
        System.out.println("Total Circumference: " + group.calculateTotalCircumference());

        Shape largestShape = group.findLargestShape();
        if (largestShape != null) {
            System.out.println("Largest Shape: " + largestShape.getClass().getSimpleName());
        }

        group.printAllShapes();
	}

}
