package geometry;

public abstract class Shape {
	double x; // X position
    double y; // y position

    abstract double calculateArea(); //Fl�cheninhalt berechnen
    abstract double calculateCircumference(); //Umfang berechnen
}
