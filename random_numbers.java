import java.util.Random;

public class random_numbers{
	public static void main(String[] args){
		System.out.println("Random Numbers");

		Random random = new Random();

		int number;

		number = random.nextInt(); // numbers range from +2 Billion to -2 Billion
		number = random.nextInt(1, 6); // numbers range from 1 to 5. random.nextInt(i, j); i to j - 1

		double x = random.nextDouble(2, 101);
		Boolean isStudent = random.nextBoolean();

		System.out.println(isStudent);
		System.out.println(number);
		System.out.println(x);
	}
}
