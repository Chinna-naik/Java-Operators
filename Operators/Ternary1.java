package Operators;

public class Ternary1 {
 
	static int a = 20;
	static int b = 30;
	static int c = 40;
	static int max;
	
	public static void main (String[] args)
	{   
		// finding the maximum of three numbers
		max = ((a>b)?(b>c)?a:b :(b>c)? b:c); // ternary operator
		System.out.println("maximum number is = " + max);
	}

}
