package HITdayPrograms;

public class ExceptionDemo2 {

	public static void main(String args[]) {
	System.out.println("Begore exception::::::");
	int num=1;
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
		num=num%2+1;
	}
int i=1/num;
    System.out.println("::: output:::");
	}

}
