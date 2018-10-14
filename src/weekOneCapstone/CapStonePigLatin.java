package weekOneCapstone;

import java.util.Scanner;

public class CapStonePigLatin {

	public static void main(String[] args) {
		// Personal Goals: Write "clean code"
		// no loosey goosey hanging comments (for loops)
		// Project Goal: Translate English to Pig Latin
		// ex: hello -> ellh + ay = ellhay
		// Ask the user for a word, translate that word,
		// ask the user for another word all lower case
		// Be sure to do the above BEFORE the case step step woman!

		String name;
		String userResponse;
		String word1;
		String word;
		String way;
		int num;
		num = 10000;

		// name.charAt(arg0)
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Pig Lating Translator!");
		System.out.println("Pig Latin is when flip English words around.");
		System.out.println("Insert \"The More You Know\" theme music and rainbow :-)");
		System.out.println(" ");

		do {
			System.out.println("Enter a line to be translated: ");
			// need to scan for userinput of word so that I can string together reverse
			// words
			word = scnr.next();
			
//			if (!word.equals(num)){ System.out.println("Please enter a word.");
//			word = scnr.next();
//			}

			word = word.toLowerCase();
//			char firstLetter = word.charAt(0);//I think it should be 0,1
//			word = word.substring(1);
//			if (word.ch //== "a,e,i,o,u"
//			we may not use this block of code, it conflicts with what we
//			we have in our public static "solve", but keeping it in for learning

			System.out.println("Pig Latin translation: " + solve(word));

			// System.out.println(word + firstLetter + "ay");
			// get word.toLowerCase() maybe in a new method?
			
			System.out.println("Would you like to continue? yes/no");
			//I'm having a problem with my code, the user has to press
			//enter several times for java to receive the answer?
			userResponse = scnr.next();

		} while (userResponse.equals("yes"));
		userResponse = scnr.next();

	}

//	private static boolean isVowel(String way) {
//
//		if (way.startsWith("a")) {
//			return true;
//		}
//		if (way.startsWith("e")) {
//			return true;
//		}
//		if (way.startsWith("i")) {
//			return true;
//		}
//		if (way.startsWith("o")) {
//			return true;
//		}
//		if (way.startsWith("u")) {
//			return true;
//
//		}
//		return true; //this gave me the hardest time, I'm not sure if this
//					//method is working or the one below, to be honest
//					//but the program runs :-)!
//
//	}

	public static String solve(String word) {
		String temp = word.toLowerCase();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char first = temp.charAt(0);

		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {
				return word + "way";
			}
		}

		word = word.substring(1);
		word += first + "ay";

		return word;
	}
}
