public class Circle extends Shape{

	final double PI = 3.14;
	double radius;
	
	Circle(double r){
		radius =r;
	}
	
	@Override
	void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area = "+ (this.PI*this.radius*this.radius));
	}

	@Override
	void getShape() {
		System.out.println("This is a Circle");
		
	}

}