import java.util.TreeSet;

public class Find_Highest_palindrome_Value_BetweenAandB {
	 //a = 913  //b = 993  //Highest palindrome = 906609
	//need to find between 0 to 1000
	
    public static void main(String[] args) {
    	int highestPalindrome = 0;
    	int aValue = 0;
    	int bValue = 0;
    	
    	for(int i=1; i<=1000;i++)
    	{
    		for(int j=1; j<=1000;j++)
    		{
    			int mul = i*j;
    			int reverse = isPalindrome(mul);
    			if((reverse==mul) && (reverse>highestPalindrome))
    			{
    				aValue = i;
    				bValue =j;
    				highestPalindrome =reverse;
    			}
    			
    		}
    	}
    	System.out.println("aValue is : "+aValue);	
    	System.out.println("bValue is : "+bValue);	
    	System.out.println("highestPalindrome is : "+highestPalindrome);	
    	
    }
    
    public static int isPalindrome(int mul)
    {
    	int rev = 0;
    	while(mul!=0)
    	{
    		rev = rev*10 + mul%10;
    		mul = mul/10;
    	}
    	return rev;
    }
}
