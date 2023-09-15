package classOperators;

import java.util.Scanner;

public class Multiplicationpro
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				System.out.println("enter the digit value");
				for(int i=1;i<=20;i++)
				{
					System.out.println(num +"*"+i+ "="+(num*i));
				}

	}

}
