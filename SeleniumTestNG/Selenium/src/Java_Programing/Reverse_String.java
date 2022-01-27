package Java_Programing;

import java.util.Scanner;
 
class Reverse_String {
	
    public static void main (String[] args) {
    	    String str;
    	    String nstr = "";
	      System.out.println("Enter an String: ");
	      Scanner sc = new Scanner(System.in);
	      str = sc.nextLine();
	      char ch;
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch + nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}