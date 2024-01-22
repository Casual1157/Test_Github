package geometry;

public class Triangle extends Shape{

	double a;
	double b;
	double c;
	double height; 
	
	 Triangle(double x, double y, double a, double b, double c, double height) {
	        this.x = x;
	        this.y = y;
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.height = height;
	    }
	double base() {//Welcher der Seiten der Basis ist
		double max = this.a;
		if(this.b>this.c) {
			if(this.b>max) {
				max = this.b;
			}	
		}
		if(this.c>this.b) {
			if(this.c>max) {
				max = this.b;
			}	
		}
		return max;
	}
	 
	@Override
	double calculateArea() { //(Basis*Höhe)/2
		// TODO Auto-generated method stub
		return 0.5*base()*height;
	}

	@Override
	double calculateCircumference() {//a + b + c
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
