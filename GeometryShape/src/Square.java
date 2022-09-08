public class Square extends Shape{

	double side ;
	Square(double s){
		side = s;
	}
	@Override
	void getArea() {
		System.out.println("Area = "+ (this.side*this.side));
	}

	@Override
	void getShape() {
		System.out.println("This is a Square");
	}

}