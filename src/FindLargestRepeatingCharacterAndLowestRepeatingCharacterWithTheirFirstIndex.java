import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindLargestRepeatingCharacterAndLowestRepeatingCharacterWithTheirFirstIndex {
	
	public static void main(String args[])
	{
	String str = "Teeeessst Autoooooomationn";
    char arr[] = str.replaceAll(" ","").toLowerCase().toCharArray();
    char leastRepeatedCharacter = 0;
    char maxRepeatedCharacter= 0 ;
	int mostRepeatingCharacterLength = 1 ;
	int leastRepeatingCharacterLength = 1;
    
	Map<Character, Integer> hm = new HashMap<Character, Integer>();
	
	for(Character ch : arr)
	{
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
		}		
	}
	
	   Set<Entry<Character,  Integer>> et =   hm.entrySet();

	   for(Entry<Character, Integer> mn : et)
	   {
		  char key =  mn.getKey();
		  int value = mn.getValue();
		  System.out.println("key is = "+key);
		  System.out.println("value is = "+value);
		  if(leastRepeatingCharacterLength >= value)
		  {
			  leastRepeatingCharacterLength = value;
			  leastRepeatedCharacter = mn.getKey();
		  }
		  else if(mostRepeatingCharacterLength <= value)
		  {
			  mostRepeatingCharacterLength = value;  
			  maxRepeatedCharacter = mn.getKey();
		  }
	   }
	
	   System.out.println("leastRepeatedCharacter : "+leastRepeatedCharacter);
	   System.out.println("leastRepeatingCharacterLength : "+leastRepeatingCharacterLength);
	   System.out.println("maxRepeatedCharacter : "+maxRepeatedCharacter);
	   System.out.println("mostRepeatingCharacterLength : "+mostRepeatingCharacterLength);
		
	}
	


}
