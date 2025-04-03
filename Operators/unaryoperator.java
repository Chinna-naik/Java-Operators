package Operators;

public class unaryoperator {

	    
	    static int a = 5;

	    public static void main(String[] args) {   
	        // Unary plus
	        System.out.println("+a : " + (+a));  // Returns the same value
	        
	        // Unary minus
	        System.out.println("-a : " + (-a));  // Negates the value
	        
	        // Prefix increment
	        System.out.println("++a : " + (++a));  // Increments first, then uses the value
	        
	        // Post increment
	        System.out.println("a++ : " + (a++));  // Uses the current value, then increments
	        
	        // Prefix decrement
	        System.out.println("--a : " + (--a));  // Decrements first, then uses the value
	        
	        // Post decrement
	        System.out.println("a-- : " + (a--));  // Uses the current value, then decrements
	    }
	}



