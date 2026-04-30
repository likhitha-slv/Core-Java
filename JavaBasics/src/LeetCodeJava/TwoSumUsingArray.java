package LeetCodeJava;

public class TwoSumUsingArray {

	public static void main(String[] args) {
    int nums[] = {2,7,11,15,16,10,8,7,4};
    boolean read[]=new boolean[nums.length];
    int target = 18;
    
    for(int i=0;i<nums.length;i++)
    {
    	if(read[i]) continue;
    	for(int j=0;j<nums.length;j++)
    	{
    		if(read[j]) continue;
    		
    		if(nums[i] + nums[j] == target)
    		{ 
    			read[i]=true;
    			
    			System.out.println("[" +i+ " " +j + "]");
    		}
    	}
    }
	}

}
