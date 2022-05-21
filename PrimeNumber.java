package FirstWeek;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		boolean flage=false;
		for(int i=2;i<=input/2;i++) {
			if(input % i==0) {
				System.out.println("Not a Prime number");
						flage=true;
			}
			break;
		}
		if(flage==false){
			System.out.println("It is Prime number");
		}
		

	}

}
