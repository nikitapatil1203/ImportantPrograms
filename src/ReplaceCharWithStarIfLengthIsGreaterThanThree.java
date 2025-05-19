import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReplaceCharWithStarIfLengthIsGreaterThanThree {

	public static void main(String[] args) {
		
    //input = "Same ytegde eat"
	//o/p =  "Same ****** eat " 
		
		System.out.println("enter any sentence");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    String arr[] = str.split(" ");
		String result = "";
		
		for(String ar : arr)
		{
			if(ar.length()>4)
			{
				for(int i=0;i<ar.length();i++)
				{
					System.out.print("*");
				}	
				System.out.print(" ");
			}
			else
			{
				System.out.print(ar + " ");
			}
		}


		
	}

}
