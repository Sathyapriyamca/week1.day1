package FirstWeek;

import java.util.Scanner;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisnumber=7846236;
	String bikeName="Beneli";
	double runningKM=180.25;

	public static void main(String[] args) 
	{
		TwoWheeler obj1 = new TwoWheeler();
		System.out.println("Bike Details are:");
		System.out.println(obj1.noOfWheels);
		System.out.println(obj1.noOfMirrors);
		System.out.println(obj1.chassisnumber);
		System.out.println(obj1.bikeName);
		System.out.println(obj1.runningKM);
		
	}

}
