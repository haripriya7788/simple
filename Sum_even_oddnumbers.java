package classOperators;

public class Sum_even_oddnumbers 
{
	public static void even()
	{
		int sum=0;
		int evenCount=0;
		int evenAvg;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) {
				System.out.println(" "+i);
				sum=sum+i;
	            evenCount++;
			}
		}
		System.out.println(" ");
		System.out.println("sum of the numbers from 1 to 10: " +sum);
		System.out.println(" count of odd numbers from 1 to 10:  +evenCount");
		evenAvg=sum/evenCount;
		System.out.println("Average of odd numbers from 1 to 10:  +evenAvg ");
	}
	public static void odd() {
		int sum=0;
		int oddCount=0;
		int oddAvg;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) {
				System.out.println(" "+i);
				sum=sum+i;
	            oddCount++;
			}
			}
		System.out.println(" ");
		System.out.println("sum of the numbers from 1 to 10: " +sum);
		System.out.println(" count of odd numbers from 1 to 10:  +oddCount");
		oddAvg=sum/oddCount;
		System.out.println("Average of odd numbers from 1 to 10:  +oddAvg ");
	}
	

		
public static void main(String[] args) {
		// TODO Auto-generated method stub
     even();
     odd();
	}

}
