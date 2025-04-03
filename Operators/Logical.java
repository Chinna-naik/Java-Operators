package Operators;

public class Logical {
	
	static boolean A = true;
	static boolean B = false;
	
	public static void main(String[] args)
	{
	  // And operator (&&)
	 System.out.println("A&&B :" +(A && B));
	 
	 // Or operator (||)
	 System.out.println("A||B :" +(A || B));
	 
	 // Not operator (!=)
	 System.out.println("!A :"+(!A));
	 System.out.println("!B :"+(!B));
	 
	 // combination 
	 System.out.println("(A || B) && !B: " + ((A || B) && !B));
	 System.out.println("(A || B) && !A: " + ((A || B) && !A));
	 System.out.println("(A && B) || !A: " + ((A && B) || !A));
	 System.out.println("(A && B) || !B: " + ((A && B) || !B));
	} 
	

}
