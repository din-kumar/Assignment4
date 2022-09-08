import java.util.Scanner;
import java.util.ArrayList;

public class Oddarraylist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);							// Scanner function to take user input
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		System.out.println("Enter number");
		System.out.println("1. For continue enter Next number");
		System.out.println("Press 0 to stop the loop");
		int a;
		do {														// starting of do while loop
			a = sc.nextInt();
			all.add(a);												// add all the numbers to ArrayList all
			if(a%2 !=0) {
				odd.add(a);											// add odd numbers to ArrayList odd
			}
		}while(a!=0);												// end of do while loop
		
		System.out.println("Elements entered by you");
		all.forEach(n-> System.out.print(n+", "));					//Print all numbers in ArrayList
		
		System.out.println("\nOdd elements");
		odd.forEach(n-> System.out.print(n+", "));				// print the odd numbers in ArrayList
		sc.close();
 	}

}