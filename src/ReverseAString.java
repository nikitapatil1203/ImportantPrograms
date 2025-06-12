import java.util.ArrayList;

public class ReverseAString {

	public static void main(String[] args) {
		
		//reverse complete String
	   String str = "nikita";
	   String rev = "";
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   rev = rev+str.charAt(i);
	   }
	   // System.out.println("Reverse is == "+rev);
	    
	    
	    //reverse only words not characters
	    String str1 = "nikita patil is my name";
	    String arr[]=  str1.split(" ");
	    String rev1 = "";
	    
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	rev1 = rev1 + arr[i] + " ";
	    }
	   // System.out.println("Reverse is = "+rev1);
	    

        //reverse whole string as well as each words from a string 
	    String str2 = "nikita patil is my name";
	    String arr2[] = str2.split(" ");
	    String rev2 = "";
	    
	    for(int i=arr2.length-1; i>=0;i--)
	    {
	    	String newString = arr2[i];
	    	for(int j=newString.length()-1; j>=0;j--)
	    	{
	    		rev2 = rev2 +newString.charAt(j);
	    	}
	    	rev2 = rev2 + " ";
	    }
	   // System.out.println("reverse is = "+rev2);
	    
	    
	    //reverse all other characters except special characters
	     String input = "a@b#1c$d";
	    //expected output = "d@c#1b$a"
	     String finalOutput = "";
	     int k=0;
	     ArrayList<Object> lst = new ArrayList<Object>();
	    
	     String newString = input.replaceAll("[^a-zA-Z0-9]", "");
	     String rev3 = "";
	     for(int i=newString.length()-1;i>=0;i--)
	     {
	    	 rev3 = rev3+newString.charAt(i);
	    	 lst.add(newString.charAt(i));
	     }
	    // System.out.println(rev3);
	     
	     for(int j=0; j<input.length();j++)
	     {
	    	 if(lst.contains(input.charAt(j)))
	         {
	    		finalOutput =  finalOutput + rev3.charAt(k);
	    		k++;
	         }
	    	 else
	    	 {
	    		 finalOutput = finalOutput + input.charAt(j);
	    	 }
	     }
	    // System.out.println(finalOutput);
	     
	    
	     
	     // ============OR =========
	     
	     //reverse all other characters except special characters
	      String str5 = "a@b#1c$d";
	    //expected output = "d@c#1b$a"
	      String mn = "";
	      int j=0;
	      
	     String output =   str.replaceAll("[^a-zA-Z0-9]", "");

	      String rev5 ="";
	      
	      for(int i=output.length()-1;i>=0;i--)
	      {
	    	  rev =rev + output.charAt(i);
	      }
	      System.out.println(rev);     //dc1ba
	      
	      char arr5[]=          str.toCharArray();
	      
	      for(Character ar:arr5)
	      {
	    	  if((ar>='a' && ar<='z') || (ar>='A' && ar<='Z') || (ar>='1' && ar<='9'))
	    	  {
	    		  mn = mn+rev.charAt(j);
	    		  j++;
	    	  }
	    	  else
	    	  {
	    		  mn = mn+ar;
	    		
	    	  }
	      }
	      System.out.println(mn);
	      
	      
	}

}
