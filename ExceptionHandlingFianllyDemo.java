package HITdayPrograms;

public class ExceptionHandlingFianllyDemo {
	public static void main(String args[]) {
		System.out.println("Begore exception::::::");
		int num=4;
		try {
		num=Integer.parseInt(args[0]);
		int i=1/num;
		System.out.println("Inside The try block");
		
		
		}catch(ArithmeticException ae)
		{
			System.out.println("While Arithmetic Exception::::");
			
			num=num+1;		
				
		}
		catch(Exception e)
		{
			System.out.println("Everything will be fine:::");
			num=1;
		}
		//finally {
			 //num=1;
			//System.out.println(num+":What is altered in finally statement");
			
		//}
	int i=1/num;
	    System.out.println("::: output:::");
	    System.out.println("Value of i is.:"+i);
	    
		
		
	}

}
