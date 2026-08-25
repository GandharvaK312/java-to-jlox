import java.util.Scanner;

public class weight_conversion{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int choice;
		while(true){
			System.out.println("Weight Conversion Program\n1: lbs to kgs\n2: kgs to lbs\n3: exit\nChoose an option");
			choice = scanner.nextInt();
			if( choice == 3 ) break;
			double weight;
			switch(choice){
				case 1: System.out.printf("Enter weight in lbs: "); weight = scanner.nextDouble() * 0.453592;
					System.out.println(weight + " kgs\n"); break; 
				case 2: System.out.printf("Enter weight in kgs: "); weight = scanner.nextDouble() * 2.204621;
					System.out.println(weight + " lbs\n"); break; 
				default: System.out.println("Enter valid option");
			}
		}

		scanner.close();
	}
}
