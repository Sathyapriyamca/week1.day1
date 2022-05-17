package FirstWeek;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1,n2,n3,i,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start value");
		n1=sc.nextInt();
		System.out.println("Enter the second value");
		n2=sc.nextInt();
		System.out.println("Enter the count value");
		count=sc.nextInt();
		for(i=0;i<=count;i++)
		{
			System.out.println(n1+"");
			n3=n1+n2;
			
			n1=n2;
			n2=n3;			
			
		}
			

	}

}
