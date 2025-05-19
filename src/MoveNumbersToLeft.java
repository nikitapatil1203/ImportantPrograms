import java.util.ArrayList;

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
		
		
		

	}

}
