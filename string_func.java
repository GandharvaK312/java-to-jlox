public class string_func{
	public static void main(String[] args){

		String name = "HelloWorld", name2 = "HeyThere";

		System.out.printf("%s\n", name); 
		System.out.printf("%s\n", name2);
		System.out.printf("length: %d\n", name.length());
		System.out.printf("charAt(3): %c\n", name.charAt(3));
		System.out.printf("indexOf: %d\n", name.indexOf('W', 8)); // index of the first occurence
		System.out.printf("lastIndex: %d\n", name.lastIndexOf("o")); // index of the last occurence
		System.out.printf("toUpper: %s\n", name.toUpperCase());
		System.out.printf("toLower: %s\n", name.toLowerCase());
		System.out.printf("trim: %s\n", name.trim()); // eliminates whitespace before and after the string
		System.out.printf("replace: %s\n", name.replace("l", "_"));
		System.out.printf("isEmpty: %s\n", name.isEmpty());
		System.out.printf("contains: %s\n", name.contains("o"));
		System.out.printf("equals: %s\n", name.equals(name2)); // equalsIgnoreCase to ignore case sensitivity while checking equalit
	}
}
