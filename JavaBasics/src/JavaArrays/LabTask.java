package JavaArrays;

public class LabTask {

	public static void main(String[] args) {
    int arr[] = {10,15,20,25,30,35};
    for(int i:arr)
    {
    	if(i % 2==0)
    	{
    		System.out.println("even:" +i);
    	}
    	else
    	{
    		System.out.println("Odd:" +i);
    	}
    }
	}

}
