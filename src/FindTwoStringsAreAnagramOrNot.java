import java.util.ArrayList;
import java.util.List;

public class FindTwoStringsAreAnagramOrNot {

	public static void main(String[] args) {
		
		String str = "listen";
		String str2  = "silent";
		
		List<Character> lst = new ArrayList<Character>();
		List<Character> lst1 = new ArrayList<Character>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			lst.add(str.charAt(i));
		}
		
		for(int j=0;j<=str2.length()-1;j++)
		{
			lst1.add(str2.charAt(j));
		}
		System.out.println(lst);
		System.out.println(lst1);
		if(lst.containsAll(lst1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
