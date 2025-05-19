import java.util.ArrayList;
import java.util.HashMap;

public class Dont_increase_the_value_of_counter_if_you_find_any_duplicate {
	//discription : need to move from top to bottom and print 1,2,3,...
	//but if will find any duplicate don't increase the value
//	input
//	5
//	john tom
//	john mary
//	john tom
//	mary anna
//	mary anna
	
	//output
//	1
//	2
//	2
//	3
//	3

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		   HashMap<String, Integer> hm = new HashMap<String,Integer>();
		    str.add("john tom");
		    str.add("john mary");
		    str.add("john tom");
		    str.add("mary anna");
		    str.add("mary anna");
		    
		  int j=0;
		    for(int i=0;i<str.size();i++)
		    {
		      String newString =str.get(i); 
		      if(hm.containsKey(newString))
		      {
		    	  System.out.println(j);
		    	  hm.put(newString, hm.get(newString)+1);
		      }
		      else
		      {
		    	  j++;
		    	  System.out.println(j);
		    	  hm.put(newString, 1);
		      }
	
		    }
	

	}

}

