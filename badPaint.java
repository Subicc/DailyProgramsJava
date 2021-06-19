package HITdayPrograms;
import java.util.Scanner;

public class badPaint {

	public static void main(String[] args) {
    badPaint bp=new badPaint();
    Scanner scan=new Scanner(System.in);

    System.out.println("Enter the choice like 1-RED:");
    System.out.println("Enter the choice like 2-BLUE:");
    System.out.println("Enter the choice like 3-GREEN:");
    System.out.println("Enter the choice like 4-PINK:");
  
    int choice=scan.nextInt();
    bp.doPaint(choice);
	}
    public 	void doPaint(int choice)
    {
    	if(choice==1)

    	{
    		System.out.println("Red.....!");
    	}
    	else if(choice==2)
    	{
    		System.out.println("Blue.......!");
    		
    	}
    	else if(choice==3)
    	{
    		System.out.println("Green....!");
    		
    	}
    	else if(choice==4)
    	{
    		System.out.println("Pink.....!");
    	}
    
 
    }}


