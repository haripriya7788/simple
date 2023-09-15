package classOperators;

public class DuplicateLrtter {


	public static void main(String[] args) {
		String s= "shimakhtechnology";
		char[] ch= s.toCharArray();
		
		for(int i=1;i<ch.length;i++) 
		{
			for(int j=1;j<ch.length;j++)
{
				if(ch[i]==ch[j]);
}
			System.out.println(ch[i]);
		//break;
		}
		

	}

}
