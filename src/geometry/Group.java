package geometry;

import java.util.ArrayList;

public class Group {
	 ArrayList<Shape> shapes = new ArrayList<>(); // Array für die Forme

	    void addShape(Shape shape) { // fügt ein Form
	        shapes.add(shape);
	    }

	    void removeShape(Shape shape) {// löscht ein Form
	        shapes.remove(shape);
	    }

	    double calculateTotalArea() {// berechnet die Gesamtflächeninhalt (Summe der Flächeninhalt aller Forme)
	        double totalArea = 0;
	        for (Shape shape : shapes) {
	            totalArea += shape.calculateArea();
	        }
	        return totalArea;
	    }

	    double calculateTotalCircumference() {// berechnet die Gesamtumfang (Summe der Umfang aller Forme)
	        double totalCircumference = 0;
	        for (Shape shape : shapes) {
	            totalCircumference += shape.calculateCircumference();
	        }
	        return totalCircumference;
	    }

	    Shape findLargestShape() {//findet die größte Form
	        if (shapes.isEmpty()) {
	            return null;
	        }
	        Shape largestShape = shapes.get(0);
	        for (Shape shape : shapes) {
	            if (shape.calculateArea() > largestShape.calculateArea()) {
	                largestShape = shape;
	            }
	        }

	        return largestShape;
	    }

	    void printAllShapes() {
	        for (Shape shape : shapes) {
	            System.out.println(shape.getClass().getSimpleName() + " at position (" + shape.x + ", " + shape.y + ")");
	        }
	    }
}
