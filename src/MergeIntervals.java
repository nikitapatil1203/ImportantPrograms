import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		
		
		int intevals[][] = {{1,3}, {2,6}, {8,10}, {15,18}};
		
		
	    Arrays.sort(intevals, Comparator.comparingInt(a -> a[0]));
	    
	    List<int[]> mergeArray = new ArrayList<int[]>();
	    
			int[] currentInterval =  intevals[0];    
			mergeArray.add(currentInterval);
			
			for( int[] inteval :intevals )
			{
				int firstend = currentInterval[1];
				int nextend = inteval[1];
				int nextstart = inteval[0];
				
				if(firstend>=nextstart)
				{
					currentInterval [1] = Math.max(firstend,nextend);
				}
				else
				{
					currentInterval = inteval;
					mergeArray.add(currentInterval);
					
				}
			}
		for(int[] interval : mergeArray)
		{
			System.out.println(Arrays.toString(interval));
			
		}
	    		
	}

}
