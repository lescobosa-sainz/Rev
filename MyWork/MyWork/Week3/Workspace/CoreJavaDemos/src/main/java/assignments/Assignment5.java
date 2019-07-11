package assignments;

import java.util.Scanner;

public class Assignment5 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String newString = "",word,reverseword;
		System.out.println("Enter a word");
		word = scan.nextLine();
	

		int start = 0, end = 0;

		StringBuilder input = new StringBuilder();

		System.out.println("Enter a number for a start index");
		start = scan.nextInt();

		System.out.println("Enter a number for a end index");
		end = scan.nextInt();

		input.append(word);
		 String reverseWord = word;
		 reverseWord = input.reverse().toString();

		String newWord = (start > end) ? reverseWord : word;

		int newStart = (start > end) ? word.length() - start - 1 : start;

		int newEnd = (start > end) ? word.length() - end - 1 : end;

		if (newEnd > newWord.length() || newStart > newWord.length()) {
			end = newWord.length();
		}

		for (int i = newStart; i < newEnd; i++) {
			String letter = String.valueOf(newWord.charAt(i));
			newString = newString + letter;
		}
		System.out.println(newString);
	}
}
