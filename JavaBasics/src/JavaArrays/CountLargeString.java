package JavaArrays;

public class CountLargeString {

	public static void main(String[] args) {
    System.out.println("main method started");
    String[] arr = {"likki","dikki","chikki","nikki"};
    
    
    int maxLen = arr[0].length();

    for(int i = 1; i < arr.length; i++) {
        if(arr[i].length() > maxLen) {
            maxLen = arr[i].length();
        }
    }
    int count =0;

    for(int i=0;i<arr.length;i++)
    {
    
    	if(arr[i].length() == maxLen)
    	{
    		 count++;
    	}
    }
    System.out.println("Count the letter of extra digit:"  +count);
    System.out.println("Max Length is:"  +maxLen);
	}

}
