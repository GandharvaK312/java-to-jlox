import java.util.Scanner;

public class mad_libs{
	public static void main(String[] args){

		// a game that basically makes a story with blanks to be filled by the user. jimmy fallon has these games where he fills out parts of speech and scenario based questions. same thing

		Scanner scanner = new Scanner(System.in);

		String adjective1, noun1, adjective2, verb1, adjective3, noun2;

		System.out.print("An adjective: ");
		adjective1 = scanner.nextLine();

		System.out.print("Something you would name your kitten: ");
		noun1 = scanner.nextLine();
		
		System.out.print("Another adjective: ");
		adjective2 = scanner.nextLine();
		
		System.out.print("Your hobby in -ing form: ");
		verb1 = scanner.nextLine();
		
		System.out.print("An actor's name: ");
		noun2 = scanner.nextLine();
		
		System.out.print("Lastly, another adjective: ");
		adjective3 = scanner.nextLine();

		System.out.println("Agent " + noun1 + ", you have been assigned a secret mission");
		System.out.println("Your mission is to take a " + adjective1 + " " + noun2 + " and make it " + adjective2 + " and " + adjective3 + " by " + verb1 + " on it.");

		scanner.close();
	}
}
