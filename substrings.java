import java.util.Scanner;

public class substrings{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		String email = scanner.nextLine(), username, domain;

		if( email.contains("@") ) {
			int index = email.indexOf("@");
			username = email.substring(0, index);
			domain = email.substring(index + 1);
			System.out.println(username);
			System.out.println(domain);
		}
		else System.out.println("Enter valid email");

		//String username = email.substring(0, 6);
		//String domain = email.substring(7);
//		System.out.println(email);
//		System.out.println(username);
//		System.out.println(domain);


		scanner.close();
	}
}
