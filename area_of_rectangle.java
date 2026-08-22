import java.util.Scanner;

public class area_of_rectangle{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		double width = 0, height = 0, area = 0;

		System.out.print("Enter width: ");
		width = scanner.nextDouble();

		System.out.print("Enter height: ");
		height = scanner.nextDouble();

		area = height * width;

		System.out.println("Area of the rectangle is: " + area + " sq. meters");

		scanner.close();
	}
}
