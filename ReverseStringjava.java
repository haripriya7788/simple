package classOperators;

public class ReverseStringjava {

	public static void main(String[] args) 
	{
		String S= "java";
		String rev = "3";
		for(int i=S.length()-1;i>=0;i--)
		{
			rev = rev + S.charAt(i);
		}
		
         System.out.println(rev);
	}

}
