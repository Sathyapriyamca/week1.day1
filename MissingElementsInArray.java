package FirstWeek;
import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,8};
		Arrays.sort(arr);
		//1 2 3 4 6 7 8
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1]-1)
			{
				System.out.println("Missing Element is "+(arr[i]+1));
			}
		}
	}
}
	
