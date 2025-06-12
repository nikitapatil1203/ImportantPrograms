
public class TakePartialStringAndReverseIt {

	public static void main(String[] args) {
		String str =  "NikitaPatil";
		//output: AtIkIn  
		String xy = "";
		String rev = "";
        String rv = str.substring(0,6).toUpperCase();
        System.out.println(rv);
        
        for(int i=rv.length()-1;i>=0;i--)
        {
        	char a = rv.charAt(i);
      	    String ab = a+"";
        	if(i%2==0)
        	{
        	  xy = ab.toLowerCase();      	  
        	}
        	else
        	{
        	  xy = ab.toUpperCase();
        	}
        	rev = rev+xy;
        }
        System.out.println(rev);
        
        
        
        //=====================or====================
/*
		String str =  "NikitaPatil";
		//output: AtIkIn 
		String str1 = "";
		char initialChar = 0;
		String rev ="";
        
		outerloop:
		for(int i=1;i<=str.length()-1;i++)
		{         
		   initialChar = str.charAt(0);
		  char ab =  str.charAt(i);
			 if((ab>=97 && ab<=122))
			 {
				 str1=str1+ab;
			 }
			 else
			 {
				 break outerloop;
			 }
		}
		str1 = initialChar+str1;
		//System.out.println(str1);
		   str1 =     str1.toLowerCase();
		for(int j=str1.length()-1;j>=0;j--)
		{
			if(j%2==0||j==0)
			{
			String p = 	(str1.charAt(j)+"").toLowerCase();
			rev = rev+p;
			}
			else
			{
				String q = 	(str1.charAt(j)+"").toUpperCase();
				rev = rev+q;
			}
		}
		System.out.println(rev);
		
        
          */         
        
	}

}
