package Java_Programing;

import java.util.Scanner;

public class Count_character_in_string
{
  public static void main(String[] args) {
	  
	  
	  String str1;
      System.out.println("Enter an String :: ");
      Scanner sc = new Scanner(System.in);
      str1 = sc.nextLine();
    int count=0;
    
    for (int i=0;i<str1.length();i++)
    {
       if(Character.isLetter(str1.charAt(i)))
    	   count++;
    }
System.out.println("the number of alphabets in the given string is:"+count);
  }
}
