import java.util.Scanner;

public class if_statements{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		int age; String name;

		System.out.println("if statements..!!");
		System.out.print("Enter age: "); age = scanner.nextInt(); scanner.nextLine();
		System.out.print("Enter name: "); name = scanner.nextLine();

		if(name.isEmpty()) System.out.println("Name not entered");

		if( age >= 18 ) System.out.println("You are an adult");
		else if( age < 0 ) System.out.println("You have not been born yet");
		else System.out.println("You are NOT an adult");

		scanner.close();
	}
}
