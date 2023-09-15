package classOperators;

public class Logicaloperator {

	public static void main(String[] args)
	{
	
	//&& - AND 
		boolean booleanVal2 = false;
		boolean booleanVal1 = true;
		System.out.println("output of AND is"+(booleanVal1&&booleanVal2));
		
	// || - OR
		System.out.println("output of OR is"+(booleanVal1||booleanVal2));
		
		// ! - NOT
		System.out.println("output of NOT is"+(!booleanVal1));
	}
	

}
