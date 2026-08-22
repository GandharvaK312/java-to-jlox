public class basic_datatypes{
 
	public static void main(String[] args){
		// comment same as C family

		/*    Like I said, The Same    */
		/*
		 	int, char, double, boolean stored in stack - primitive
			string, array, objects in heap - reference basically pointers
		 */

		System.out.print("Hello World!\n");
		System.out.println(2 + 3 + " is Five!!");
		
		int age = 500;
		System.out.println("Age: " + age);

		if( age > 180 ) System.out.println("You are older than " + age);
		int year = 2023;
		if( ( year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println(year + " is a leap year");

		double price = 200.99;
		System.out.println("price: " + price);

		char grade = 'A';
		System.out.println("grade: " + grade);

		boolean isStudent = true;
		System.out.println("isStudent: " + isStudent);

		String name = "Gandharva";
		String lastname = " Kulkarni";
		String fullname = name + lastname;
		System.out.println("Name: " + name + "\nlastname: " + lastname + "\nfullname: " + fullname);
	}
}
