import java.util.Scanner;

public class compound_interest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		double principal, amount, compound_interest, rate; int years, times_compounded;

		System.out.print("Enter principal amount: ");
		principal = scanner.nextDouble();

		System.out.print("Enter rate of interest: ");
		rate = scanner.nextDouble() / 100;

		System.out.print("Enter # of times compounded per year: ");
		times_compounded = scanner.nextInt();

		System.out.print("Enter time: ");
		years = scanner.nextInt();

		amount = principal * Math.pow( 1 + (rate/times_compounded), years * times_compounded);

		compound_interest = amount - principal;

		System.out.printf("compound interest: %,.2f\tamount: %,.2f\n", compound_interest, amount);

		scanner.close();
	}
}
