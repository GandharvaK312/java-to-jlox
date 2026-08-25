import java.util.Scanner;

public class nested_if{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		int a, b, c;

		a = scanner.nextInt(); b = scanner.nextInt(); c = scanner.nextInt();

		if( a > b ) if( a > c ) System.out.printf("a: %d is max\n", a);
			    else System.out.printf("c: %d is max\n", c);
		else if( b > c ) System.out.printf("b: %d is max\n", b);
		     else System.out.printf("c: %d is max\n", c);

		scanner.close();
	}
}
