import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InAWordWhereEverAVowelIsReplaceItWithPositionOfACharacter {

	public static void main(String[] args) {
	//	String input = "apple";         //Output: "1ppl5"
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		String result = "";
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 1);
		hm.put('e', 5);
		hm.put('i', 9);
		hm.put('o', 15);
		hm.put('u', 21);
		
	   char arr[] = input.toCharArray();
	   
	   for(Character ar:arr)
	   {
		   if(hm.containsKey(ar))
		   {
			  int position = hm.get(ar);  
			  result = result+position;
		   }
		   else
		   {
			   result = result+ar;
		   }   
	   }
	   System.out.println(result);
		
		

	}

}
