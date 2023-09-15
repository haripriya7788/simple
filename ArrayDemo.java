package classOperators;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		
		arr[2]=25;
		arr[3]=45;
		System.out.println("the length of the arr"+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]");
		}

		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
