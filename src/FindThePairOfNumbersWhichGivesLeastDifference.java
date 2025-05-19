import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class FindThePairOfNumbersWhichGivesLeastDifference {

	public static void main(String[] args) {
		
		int arr[] = {20,15,8,2,12,5}; 
		//o/p  - (15,12), (8,5) (2,5)
		
		int smallestDifference = arr[0]-arr[1];
	
        ArrayList<String> lst = new ArrayList<String>();
	
		for(int i=0 ; i<arr.length-1;i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				int difference = 0;
				if(arr[i]<arr[j])
				{
				 difference = arr[j]-arr[i];
				}
				else
				{
			     difference = arr[i]-arr[j];	
				}
			
				if(difference < smallestDifference)
				{
					smallestDifference = difference;
					System.out.println(difference);
				    lst.clear();  //found a smaller one
					lst.add((arr[i]+","+arr[j]));
				}
				else if(difference == smallestDifference)
				{
					lst.add((arr[i]+","+arr[j]));
				}
			}
		}
		System.out.println(lst);

	}

}
