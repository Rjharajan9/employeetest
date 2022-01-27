package Java_Programing;

import java.util.Scanner;

 class Find_Odd_Even {
	
	 public static void main(String[] args) {
		
	
	int num;
	System.out.println("Number:");
	Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    
    if (num % 2 == 0)
        System.out.println("Even Number");
     else
        System.out.println("Odd Number:");
}
}