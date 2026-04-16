package JavaArrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementUsingSet {

	public static void main(String[] args) {
    System.out.println("main method started");
    int[] arr = {2,3,4,1,2,1};
    Set<Integer> set = new HashSet<>();
    Set<Integer> duplicates = new HashSet<>();
    for(int a : arr)
    {
    	if(!set.add(a))
    	{
    		duplicates.add(a);
    	}
    }
    System.out.println(duplicates);
	}

}
