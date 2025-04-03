package Operators;

public class Ternary {
	
static int a = 20;
static int b = 30;
static int max;

public static void main(String[] args)
{
	// Finding the Maximum of Two Numbers
	int max = (a > b) ? a:b; // ternary operator
	System.out.println("Greater number = "+ max);
}

}
