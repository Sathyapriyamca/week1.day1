package FirstWeek;


 class car {

	public void applyBrake()
	{
		System.out.println("applyBrake");
	}
	public void applyGear()
	{
		System.out.println("applyGear");
	}
	public void switchAc()
	{
		System.out.println("switchAc");
	}
	public void applyAcclerate()
	{
		System.out.println("applyAcclerate");
	}
}
 public class Mycar	
 {
	public static void main(String[] args) {
		
		car mycar = new car();
		mycar.applyBrake();
		mycar.applyGear();
		mycar.switchAc();
		mycar.applyAcclerate();
	}

}

 