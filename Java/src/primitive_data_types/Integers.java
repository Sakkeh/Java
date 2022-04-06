package primitive_data_types;

public class Integers {
		
	public static void main(String[] args) {

		/*
			Java defines four integer types: byte, short, int, and long. 
			
			All of these are signed, positive and negative values.
						
			Name	Width	Range
			========================
			byte	8		-128 to 127
			short	16		-32768 to 32767
			int		32		-2147483648 to 2147483647
			long	64		-9223372036854775808 to 9223372036854775807
			
		 */

		byte b = 126;
		System.out.println("This is a byte b : " + b);
		
		short s = -32768;
		System.out.println("This is a short s : " + s);		
		
		int i = 2147483647;
		System.out.println("This is a int i : " + i);			
		
		long l = 9223372036854775807L;
		System.out.println("This is a long l : " + l);				

	}

}
