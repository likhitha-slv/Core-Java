package JavaConstructor;
import java.util.Scanner;
class ChatModeration 
{
public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the message");
	   String msg = sc.next();
	   boolean spam = false;
	   for(int i=0 ; i< msg.length() - 2; i++)
	   {
		   if(msg.charAt(i) == msg.charAt(i+1) && msg.charAt(i)  == msg.charAt(i+2))
		   {
			   spam = true;
			   break;
		   }
	   }
		   if(spam)
		   {
			   System.out.println("Spam");
		   }
		   else
		   {
			   System.out.println("Safe");
		   }
	  }

}


