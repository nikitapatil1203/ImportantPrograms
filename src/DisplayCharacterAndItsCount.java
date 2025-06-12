
public class DisplayCharacterAndItsCount {

	public static void main(String[] args) {
		
	
		String str = "aabbbccaabbbcc";
		  //o/p ->  a2b3c2a2b3c2
		String output = "";
		
		char arr[] = str.toCharArray();
		
		int counter = 0;
		   char mn = str.charAt(0);
		
		for(Character ch : arr)
		{
			if(ch.equals(mn))
			{
				counter ++;
				mn =ch;
			}
			else
			{
				System.out.print(mn);
				System.out.print(counter);
				counter=1;
				mn=ch;
			}
		}
          System.out.print(mn);
          System.out.print(counter);
	}

}
