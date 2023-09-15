package classOperators;

public class FibanacciSeries 
{

	public static void main(String[] args) 
{
		int  k,a=1; int b=1;
		int k1=0;
		System.out.println("1 1");
		while(k1<=50)
		{
			k1 =a+b;
			System.out.println(k1+" ");
			a=b;
			b=k1;		
		}
	


	}

}
