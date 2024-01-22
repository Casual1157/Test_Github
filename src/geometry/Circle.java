package geometry;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
	
	@Override
	double calculateArea() { // radius hoch 2 mal pi
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius);
	}

	@Override
	double calculateCircumference() { // radius mal 2 mal pi
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

}
