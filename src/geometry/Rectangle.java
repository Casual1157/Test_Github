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
	double calculateArea() {// L�nge mal Breite
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	double calculateCircumference() {//L�nge plus Breite mal zwei
		// TODO Auto-generated method stub
		return (this.length + this.width)*2;
	}
}
