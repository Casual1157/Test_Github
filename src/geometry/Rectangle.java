package geometry;

public class Rectangle extends Shape {
	double length;
    double width;
    
    Rectangle(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }
	@Override
	double calculateArea() {// Länge mal Breite
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	double calculateCircumference() {//Länge plus Breite mal zwei
		// TODO Auto-generated method stub
		return (this.length + this.width)*2;
	}
}
