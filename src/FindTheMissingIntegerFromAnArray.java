import java.util.ArrayList;
import java.util.List;

public class FindTheMissingIntegerFromAnArray {

	public static void main(String[] args) {
		
		int[] num = {1,3,5,6,9}; 
		List<Integer> lst = new ArrayList<Integer>();
		
		for(Integer nu:num)
		{
			lst.add(nu);
		}
		
		     
		
		for(int i=1;i<10;i++)
		{
			if(lst.contains(i))
			{
				//do nothing
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
