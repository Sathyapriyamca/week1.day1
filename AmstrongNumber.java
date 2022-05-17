package FirstWeek;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int res=num;
		
	while(num>0)
	{
		int rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		
	}
	System.out.println(sum);
	if(res==sum) {
		System.out.println("AmstrongNumber");
	}
	else
		System.out.println("Not an AmstrongNumber");

}
