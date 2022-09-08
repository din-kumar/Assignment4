import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice");
		System.out.println("1. Create a Circle Class");
		System.out.println("2. Create a Square Class");
		
		Shape shape = null ;
			
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.println("Enter radius");
				int r = sc.nextInt();
				shape =new Circle(r);
			}
			else if(choice == 2) {
				System.out.println("Enter length of a side");
				int s = sc.nextInt();
				shape = new Square(s);
			}
			else {
				System.out.println("Wrong input");
				System.exit(0);
			}
		
		System.out.println("Enter your choice");
		System.out.println("1. Get Shape");
		System.out.println("2. Get Area");
		int get = sc.nextInt();
			if(get==1) {
				shape.getShape();
			}
			else if(get==2) {
				shape.getArea();
			}
			
			else {
				System.out.println("Wrong Output");
				System.exit(0);
			}

		
		
		
		sc.close();

	}

}