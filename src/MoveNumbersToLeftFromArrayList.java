import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveNumbersToLeftFromArrayList {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		int d= 4;
		//5 1 2 3 4
		
		   List<Integer> lst = new ArrayList<Integer>();
	        List<Integer> lst1 = new ArrayList<Integer>();
	      
	        lst1.add(arr.get(0));
	      
	 for(int j=0;j<d;j++)
	 {
	        int size =  lst1.get(0);
             
	        
	         for(int i=1;i<=arr.size()-1;i++)
	         {
	          
	          int a=  arr.get(i-1);
	            int b=  arr.get(i);
	            a=b;
	            lst.add(a);
	           
	         }
	          lst.add(size);
	          lst1.clear();
	          lst1.addAll(lst);
	          lst.clear();
	          arr=lst1;
	          
	          for(Integer l : lst1)
		         {
		        	 System.out.print( l + " ");
		         }
	          
	          System.out.println(" ");
 
	 } 
 
	          
	          
	          
	         

	    }
	
		
		
	

}
