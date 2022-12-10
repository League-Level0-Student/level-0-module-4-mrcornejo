package _03_char._2_string_methods;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3
		// characters
		String str = "ABC";
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt
		char ABC = str.charAt(3);
		System.out.println(ABC);

		// 3. Print the length of your String to the console.
		// HINT: .length()
		// int count = str.length();
		System.out.println("Length of the string: " + str.length());
		// System.out.println("There are" +count+ "characters in the string!");
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i);
			char A = str.charAt(1);
			char B = str.charAt(2);
			char C = str.charAt(3);

		}

		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

		for (int i = 1; i <= 3; i++) {
			System.out.println("str");

		}
	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
