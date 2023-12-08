package fworlds;

import java.util.Scanner;
public class guessname {
	public static void main(String [] args) {
		
		
		// Yilin add some comments on here
		// Here is an implementation of input 
		Scanner in = new Scanner(System.in);
		int gcount = 0;
		String quit = "n";
		while (quit.equals("n")) {
			System.out.println("please guess my name");
		String gname =in.nextLine();
		gcount ++;
		if(gname.equals("Tommi")) {
			
			System.out.println("Congratulation!");
			
			quit = "y";
			
		}
		else {
			
			System.out.println("Do you want to quit(y/n)");
			
			quit = in.nextLine();
			
			
		}
		
		
		}
		System.out.println("Guess: "+gcount);
		
	}
}
	
	  
