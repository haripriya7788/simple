package classOperators;

public class Assaignment {

	public static void main(String[] args) 
	{
		int maths=50;
		int science=70;
		int English=70;
		int hindi=35;
		
		if(maths>=40&&science>=45&&(English>=40||hindi>40)) 
		{
			System.out.println("Students is eligible for next class");
		}
		else {
			System.out.println("Students is not qualified");
		}

	}

}
