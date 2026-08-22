import java.util.Scanner;

public class i_o{

	public static void main(String[] args){
		System.out.println("Basic I_O in Java");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name ");
		String name = scanner.nextLine();	// nextLine is used to scan a full line. next is used to scan a word
		
		System.out.print("Enter 2 words\n");
		String words = "hello";// scanner.next(); // if next is used and spaces are included in the input, the characters after space are left in the input buffer. the characters are then taken in as input for the next input line and then shows anexception error

		System.out.print("Enter age: ");
		int age = scanner.nextInt();

		System.out.print("Enter your GPA: ");
		double gpa = scanner.nextDouble();

		System.out.print("Are you a student (true/false): ");
		boolean isStudent = scanner.nextBoolean();

		System.out.println("\nHello " + name);
		System.out.println("Output is: " + words);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + gpa);
		if(isStudent) System.out.println("You are a student!");
		else System.out.println("You are NOT a student");


		// if nextInt() is taken in first, while hitting enter, "\n" is also taken as an input in the input buffer and if there is a nextLine() after this, then the \n is read for nextLine and the input is not taken from the user at all

		System.out.println("Enter number: ");
		int num = scanner.nextInt();

		scanner.nextLine(); // this gets rid of the "\n" issue

		System.out.println("Enter a color: ");
		String colour = scanner.nextLine();

		System.out.println(num + " selected!!");
		System.out.println("your fav colour is " + colour);

		scanner.close();
	}
}
