package Java_Programing;

import java.util.Scanner;

public class Count_the_repeating_word_in_string {

	public static void main(String[] args) {
		
		
		String string;
      System.out.println("Enter an String: ");
      Scanner sc = new Scanner(System.in);
      string = sc.nextLine();
      
      String word;
      System.out.println("Enter an word: ");
      Scanner sc1 = new Scanner(System.in);
      word = sc1.nextLine();
      
			String temp[] = string.split(" ");
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
				if (word.equals(temp[i]))
					count++;
				}
			System.out.println("The string is: " + string);
			System.out.println("The word " + word + " occurs " + count + " times in the above string");
	}
	}




