package classOperators;

public class VowelConsonant {

	public static void main(String[] args) 
	{
		int ch='@';
		if (Character.isLetter(ch))
		{
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u'|| ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println("given character is vowel");
			}
			else 
			{
				System.out.println("given character is consonant");
			}
		}
			else if(Character.isDigit(ch))
			{
				System.out.println("given character is number");
				
			}
			else 
			{
				System.out.println("given character is symbol");
			}
	}
			
		
		

	}



