package JavaArrays;

public class CountVowelsUsingArray {

	public static void main(String[] args) {
    System.out.println("main method started");
    String str = "Likhitha Munagapati";
    int count =0;
    char vowels[] = {'a','e','i','o','u'};
     
    
    for(int i=0;i<str.length();i++)
    {
      char ch =(char) Character.toLowerCase(str.charAt(i));
      
      
      for(int j=0;j<vowels.length;j++)
      {
    	  if(ch == vowels[j])
    	  {
    		  count++;
    		  break;
    	  }
      }
    }
    System.out.println("Vowel count is:  "  + count);
	}

}
