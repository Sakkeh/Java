package primitive_data_types;

public class Floating_point_numbers {

	public static void main(String[] args) {
		
		/*
			Floating-point numbers, also known as real numbers, are used when evaluating
			expressions that require fractional precision. For example, calculations such as
			square root, or transcendentals such as sine and cosine, result in a value whose
			precision requires a floating-point type. 
			
			There are two kinds of floatingpoint types, float and double, 
			which represent single- and double-precision numbers, respectively. 
			
			Name	Width in Bits	Approximate Range
			=========================================
			float	32				1.4e-045 to 3.4e+038
			double	64				4.9e-324 to 1.8e+308
			
		 */

		float f = 3.1416f;
		System.out.println("This is a float f : " + f);
		
		
		double d =  12.3;
		System.out.println("This is a double : " + d);
	}

}
