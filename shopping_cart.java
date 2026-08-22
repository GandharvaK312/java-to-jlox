import java.util.Scanner;

public class shopping_cart{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String item;
		int quantity;
		double price;
		char currency = '₹';
		double total;

		System.out.print("Item you would like to buy: ");
		item = scanner.nextLine();

		System.out.print("What is the price for each: ");
		price = scanner.nextDouble();

		System.out.print("How many " + item + "/s would you like to buy: ");
		quantity = scanner.nextInt();

		total = quantity * price;

		System.out.println("You bought " + quantity + " " + item + "/s");
		System.out.println("Your total: " + currency + total);
		

		scanner.close();
	}
}
