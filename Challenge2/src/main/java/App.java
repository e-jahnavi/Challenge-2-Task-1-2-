/**
 *
 */
package main.java;

import java.util.Scanner;
import java.util.Stack;

public class App {

	private static Scanner user_input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String answer;
		do {

			user_input = new Scanner(System.in);
			String input;
			String output;
			System.out.print("Enter the string to be reversed and check if input given is palindrome or not: ");
			input = user_input.nextLine();
			output = reverse(input);
			System.out.println("Reversed String:" + output);
			if (input == output || input.equals(output)) {
				System.out.println("Entered string is palindrome");
			} else {
				System.out.println("Entered string is not a palindrome");
			}
			System.out.println("do you want to continue? if yes press y");
			answer = user_input.next();

		} while (answer.equals("y"));
	}

	private static String reverse(String input) {
		if (input == null || input.equals("")) {
			return input;
		}
		final Stack<Character> stack = new Stack<Character>();
		final char[] ch = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			stack.push(ch[i]);
		}
		int k = 0;
		// Stack follows LIFO Last in First Out
		while (!stack.isEmpty()) {
			ch[k++] = stack.pop();
		}
		return String.copyValueOf(ch);
	}

}
