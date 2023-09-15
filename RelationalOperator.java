package classOperators;

public class RelationalOperator {

	public static void main(String[] args) 
	{
		int a=500;
		int b=200;
		boolean isEqual = a==b;
		boolean isGreater = a>b;
		boolean islessthan = a<b;
		boolean isGreaterOrEqual = a>=b;
		boolean islessOrEqual = a<=b;
		
//printing results
		System.out.println("a==b:"+ isEqual);
		System.out.println("a>b:"+ isGreater);
		System.out.println("a<b:"+ islessthan);
		System.out.println("a>=b:"+ isGreaterOrEqual);
		System.out.println("a<=b:"+ islessOrEqual);
		
	}

}
