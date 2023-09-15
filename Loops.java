package classOperators;

public class Loops
{
	public static void main(String[]args)
	{
		leftsidepyramid();
		Rightpyramid(10);
	}
	
private static void leftsidepyramid()
	{
		for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=1;j++)
		{
			System.out.print("*");
			System.out.print("");
		}
	}
	}
		private static void Rightpyramid(int n)
		{
		for (int i=1;i<n;i++)	
		{
			for(int j=1;j<n;j++)
			{
			System.out.print(" ");	
			}
			for(int k=1;k<n;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
        System.out.println("*");
	}

	
		
	}


