package FirstWeek;

public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public double sub(double a,double b)
	{
		return a-b;
	}
	public double mul(double a,double b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();		
		System.out.println("Add: "+cal.add(6, 4));
		System.out.println("Sub: "+cal.sub(7.7, 6.9));
		System.out.println("Mul: "+cal.mul(8, 3));
		System.out.println("Div: "+	cal.div(8, 2));
		

	}

}
