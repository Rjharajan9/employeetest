package Java_Programing;

import java.util.Scanner;

public class Count_the_occurrance_of_every_character {

		 public static void main(String[] args) {
			 
			 String str1;
		      System.out.println("Enter an String :: ");
		      Scanner sc = new Scanner(System.in);
		      str1 = sc.nextLine();
			 
				int charCountOfA = countChars(str1, 'a');
				int charCountOfG = countChars(str1, 'g');
				int charCountOfE = countChars(str1, 'e');
					
				
				System.out.println("Character count of 'a': " + charCountOfA);
				System.out.println("Character count of 'g': " + charCountOfG);
				System.out.println("Character count of 'e': " + charCountOfE);
		        }
		    
		 
		 public static int countChars(String str, char c)
		 {
		 	int count = 0;
		 		
		 	for(int i = 0; i < str.length(); i++)
		 	{
		 		char currChar = str.charAt(i);
		 		if(currChar == c)
		 			count += 1;
		 	}
		 		
		 	return count;
		 }

	}

