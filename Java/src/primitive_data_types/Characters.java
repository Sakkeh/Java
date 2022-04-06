package primitive_data_types;

public class Characters {

	
	public static void main(String[] args) {
		
		/*
			In Java, the data type used to store characters is char. 
			
			A key point to understand is that Java uses Unicode to represent characters. 
			
			Unicode defines a fully international character set that can represent all of the characters found in
			all human languages. 
			
			Name	Width in bits	Range
			==================================
			char	16				0 to 65536
			
		 */
		
		char codeForX = 88;
		char y = 'Y';
		
		System.out.println("This is a char: " + codeForX);
		System.out.println("This is a char too: " + y);
		
	}
	
}
