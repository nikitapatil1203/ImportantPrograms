import java.util.ArrayList;
import java.util.Arrays;

public class MoveNumbersToLeft {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7,8,9,10};
		int n=5;
		
		//output : {7,8,9,10,1,2,3,5,6}
		
		for(int k=0;k<5;k++)
		{
		
	    int num = arr[0];
		
		for(int i=0; i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1] = num;
		
	
		}
		
		for(int j=0; j<arr.length;j++)
		{
			System.out.print(arr[j]+ " ");
		}
		
		
		
	/*	=================== OR ============
				int arr[] = {1, 2, 3, 4 ,5 };
				int d= 4;
				//5 1 2 3 4
				
			
			for(int j=0;j<d;j++)
		{
				int size =	arr[0];
				for(int i=1;i<=arr.length-1;i++)
				{
					arr[i-1] = arr[i];
				
					
				}
				  arr[arr.length-1] = size;
		        
				System.out.println(Arrays.toString(arr));
				
				
				
		}
		*/
			
		
		

	}

}
