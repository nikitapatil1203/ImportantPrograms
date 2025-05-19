import java.util.ArrayList;

public class Get_index_of_two_digit_which_gives_sum_as_nine {

	public static void main(String[] args) {
		//need index of the digits which gives sum as nine
		
        int arr[] = {1,2,5,6,4};
        int firstDigit = 0;
        int secondDigit =0;
        int firstDigitIndex = 0;
        int secondDigitIndex = 0;

        outerLoop:
        for(int i=0; i<arr.length; i++)
        { 
        	for(int j=1;j<arr.length;j++)
        	{
        		 int sum = arr[i]+arr[j];
        		if(sum==9)
        		{
        			firstDigit = arr[i];
        			secondDigit = arr[j];
        			firstDigitIndex = i;
        			secondDigitIndex = j;
        			break outerLoop;
        		}       		
        	}
        }
        System.out.println("firstDigit is : "+firstDigit);
        System.out.println("secondDigit is : "+secondDigit);
        System.out.println("firstDigitIndex is : "+firstDigitIndex);
        System.out.println("secondDigitIndex is : "+secondDigitIndex);
   

	}

}
