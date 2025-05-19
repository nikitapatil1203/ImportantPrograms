
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
        
                   
        
	}

}
