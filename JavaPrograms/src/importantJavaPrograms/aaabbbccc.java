package importantJavaPrograms;

public class aaabbbccc 
{
	
	public static void main(String... args) 
	{
	    String a = "aaabbccccd";
	    int currentLength = 1;

	    StringBuilder result = new StringBuilder(); // empty string
	    for (int i = 1; i < a.length(); i++) 
	    {
	        if (a.charAt(i) == a.charAt(i - 1)) 
	        {
	            currentLength++;
	        } else 
	        {
	            System.out.println(currentLength + "" + a.charAt(i - 1));
	            result.append(a.charAt(i - 1)).append(currentLength > 1 ? currentLength : "");
	            currentLength = 1; // reset the length
	        }
	    }

	    // print last one
	    System.out.println(currentLength + "" + a.charAt(a.length() - 1));
	    result.append(a.charAt(a.length() - 1))
	        .append(currentLength > 1 ? currentLength : "");
	    System.out.println("result = " + result.toString());
	}	
	

}
