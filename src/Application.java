/**
 *Application Class Programming Project 4 CS131
 *Class that accepts a string and reverses it
 *@author dalec
 *ArrayStack Project
 *Version 1
 *Spring 2020
 *4/21/20
 */
import java.util.*;

public class Application {
	
	public static void main(String[] args) {

		//Scanner for the string and input of message
		Scanner a = new Scanner(System.in);
		boolean working = true;
	/**
	 * while loop that uses the reverse string method
	 */
	while(working) {
		System.out.print("Type a sentence: ");
		String s = a.nextLine();
		
		s = reverseString(s);
		
		System.out.println("Reverse: "+ s);
		//Boolean for entering another sentence
		boolean again= true;
		/**
		 *while loop asking the user to enter another sentence
		 */
		while(again) {
			System.out.println("Would you like to enter another sentence? ");
			String r = a.nextLine();
			if(r.equalsIgnoreCase("y")) {
				working = true;
				again = false;
			} else if(r.equalsIgnoreCase("n")) {
				System.out.println("GOODBYE");
				working = false;
				again = false;
			}else {
				System.out.println("Wrong Input, retry");
				again = true;
			}	
		}//Close again while loop
	}//Close working while loop
}//Closes Main
	
	public static String reverseString(String s) {
		if(s == null || s.equals(""))
			return s;
		/*
		 * Creating a new stack
		 */
		Stack<Character> stack = new Stack<Character>();
		
		//For loop to get each character in the stack
		for(int i=0; i< s.length(); i++)
			stack.push(s.charAt(i));
		
		//Creates a string builder
		StringBuilder sb = new StringBuilder();
		//Tests for if teh stack is not empty
		while(!stack.isEmpty())
			sb.append(stack.pop());
		
		return sb.toString();
	}//Close reverseString
}//Close Class
