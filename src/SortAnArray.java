import java.util.ArrayList;
import java.util.List;

public class SortAnArray {

	public static void main(String[] args) {
		
     int arr[] = {5,3,44,99,100,4,1,0};
     List<Integer> lst = new ArrayList<Integer>();
     
     for(int i=0;i<=arr.length-1;i++)
     {
    	 for(int j=1; j<=arr.length-1;j++)
    	 {
    		 if(arr[i]>arr[j])
    		 {
    			arr[i]=arr[j];
    		 }
    		 else
    		 {
    			 lst.add(arr[i]);
    		 }
    	 }
     }
     System.out.println(lst);

	}

}
