import java.util.Scanner;

public class math_class{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println(Math.PI);
		System.out.println(Math.E); // exponential variable also called euler's number pronounced as oiler

		double result;

		result = Math.pow(10, 2);
		result = Math.abs(-10);
		result = Math.sqrt(9);
		result = Math.round(12.14); // round off
		result = Math.ceil(5.0009); // round up
		result = Math.floor(9.999); // round down
		result = Math.max(100, 99.9999);
		result = Math.min(-90, -100);
		System.out.println(result);

		// Hypotenuse
		double a, b, c;

		System.out.print("Enter 'a' side: "); a = scanner.nextDouble(); 
		System.out.print("Enter 'b' side: "); b = scanner.nextDouble();

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Hypotenuse: " + c + " units");

		double radius;

		System.out.print("Enter radius: ");
		radius = scanner.nextDouble();
		
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circumference: " + circumference);
		System.out.printf("Circumference in printf: %.1f\n", circumference);
		
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area: " + area);
		System.out.printf("Area in printf: %.2f\n", area);
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("Volume: " + volume);
		System.out.printf("Volume in printf: %f\n", volume);
		
		scanner.close();
	}
}
