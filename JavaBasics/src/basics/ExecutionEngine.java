package basics;

public class ExecutionEngine {
	protected void finalize() throws Throwable
	{
		System.out.println("Finalise method called");
	}
	
	static void show()
	{
		System.out.println("show method started");
		ExecutionEngine tt = new ExecutionEngine();
		System.out.println(tt);
		System.out.println("show method ended");
	}
	public static void main(String[] args) {
		ExecutionEngine ee = new ExecutionEngine();
		System.out.println("Main method started");
		System.out.println(ee);// basics.ExecutionEngine@2b2fa4f7
		ee = null;// nullifying the objects
		
		ExecutionEngine ee3 = new ExecutionEngine();
		ee3 = ee;// reassaigning the objects
		
		new ExecutionEngine();//anonymous object
		show(); 
		System.out.println(ee);
		ExecutionEngine ee1 = new ExecutionEngine();
		System.out.println(ee1);//basics.ExecutionEngine@1dbd16a6
		
		ExecutionEngine ee2 = new ExecutionEngine();
		System.out.println(ee2);//basics.ExecutionEngine@7ad041f3
		System.gc();
	} 

}
