package variables;

public class Variables {
	
	/*
		In Java, all variables must be declared before they can be used. The basic form
		of a variable declaration is shown here:
		
		type identifier [ = value ][, identifier [= value ] …];
		
		The identifier is the name of the variable.
		You can initialize the variable by specifying an equal sign and a value.
		
		Keep in mind that the initialization expression must result in a value of the same (or compatible) type as that
		specified for the variable.  
		
		To declare more than one variable of the specified type, use a comma-separated list.
		 
	 */
	
	public static void main(String[] args) {

		int a, b, c;  // declares three ints, a, b and c.
		int d = 3, e, f = 5; // declares three more ints, initializing d and f.
		
		byte z = 22; // initializes z.
		double pi = 3.14159; // declares an approximation of pi.
		char x= 'x'; // the variable x has the value 'x'
		
		System.out.println("Integer d : " + d);
		System.out.println("Double pi : " + pi);
		System.out.println("Char x : " + x);
		
		
		// Dynamic initialization
		
		double g = 3.0, y = 4.0;
		
		// h is dynamically initialized
		double h = Math.sqrt(g * g + y * y);
		
		System.out.println("This is a dynamically initialize variable h : " + h);
		
	}
}
