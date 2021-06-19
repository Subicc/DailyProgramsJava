package HITdayPrograms;

public class ExceptonDemo1 {

	public static void main(String arg[]) {
		int num=1;
		System.out.println("Before Exception....!");
		try {
			int i=num/0;
			System.out.println("Chcek the error..");
		}
		catch(Exception e)
		
		{
			System.out.println("Catch line");
		}
		System.out.println("Affter the exception");
		
	}
}
