public class arithmetic_operators{
	public static void main(String[] args){

		int x = 10, y = 3, z;

		System.out.println("X: " + x + " Y: " + y);
		z = x + y;
		System.out.println("Sum: " + z);

		z = x - y;
		System.out.println("Diff: " + z);

		z = x * y;
		System.out.println("Prod: " + z);


		z = x / y;
		System.out.println("Div: " + z);

		z = x % y;
		System.out.println("Mod: " + z);

		// Augmented Assignment operator
		x += y; x *= y; x -= y; x %= y; x /= y;

		// Incremenet/ Decrement operator
		x ++; y ++; x --; y --;

		// order of operations [P-E-M-D-A-S] : Please Excuse My Dope Ass Swag : Parantheses Exponent Multiply Divide Add Subtract
	}
}
