package Operators;

public class Bitwaseoperator {
	
	static int  a = 5; //Stored in binary as 0101
	static int  b = 3; //Stored in binary as 0011
	
	public static void main(String[] args)
	{
		// And Bitwise (&)
		System.out.println("a & b :" + (a & b));
		
		// Or Bitwise  (|)
		System.out.println("a | b :" + (a | b));
		
		// XOR Bitwise  (^)
	    System.out.println("a ^ b :" + (a ^ b));
	    
	    // Not Bitwise (!)
	    System.out.println("~a :" + (~a));
	    
	    // Right shift Bitwise (>>)
	    System.out.println("a>>b :" + (a>>b));
	    
	    // Lift shift Bitwise (<<)
	    System.out.println("a<<b :" + (a<<b));
	}

}
