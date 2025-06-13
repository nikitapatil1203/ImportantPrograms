import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SlidingWindow {

	public static void main(String[] args) {

     // Find Longest Substring Without Repeating Characters
		String str = "naveen"; 
	    // Output: 3
		
	   char arr[] =   str.toCharArray();
	   int startpoint = 0;
	   int endpoint = 0;
	   
	   Map<Character, Integer> hm = new HashMap<Character, Integer>();
	   
	   for(Character ar:arr)
	   {
		   if(hm.containsKey(ar))
		   {
			   hm.put(ar, hm.get(ar)+1);
			   startpoint++;
		   }
		   else
		   {
			   hm.put(ar, 1);
		   }
		   endpoint++;
	   }
	   
	        Set<Entry<Character, Integer>> str1 =  hm.entrySet();
	        for(Entry<Character, Integer> entry : str1)
	        {
	        	System.out.println(entry.getKey() + ":" +entry.getValue());
	        }
	    
	    System.out.println(startpoint);
	    System.out.println(endpoint);
	    
	    System.out.println("logest String :"+(endpoint-startpoint));
	    
		
		
		
		
	}

}
