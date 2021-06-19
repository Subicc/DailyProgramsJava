package HITdayPrograms;

public class GoodBrush {
	
		public static void main(String[] args) {
			GoodPaintBrush brush=new GoodPaintBrush();
			RedPaint rp=new RedPaint();
			BluePaint bp=new BluePaint();
			GreenPaint gp=new GreenPaint();
			
			brush.rp=gp;
			brush.doPaint();
		}
	}
	class GoodPaintBrush{// in this paintbrush the code is not modified whenever a new color is chosen
		Paint rp;
		public void doPaint() {
			System.out.println(rp);
		}
	}
	/*class BadPaintBrush{// in this paintbrush the code gets modified whenever a new color is chosen
		public void doPaint(int choice) {
			
			if(choice==1) {
				System.out.println("red colour...");
			}
			else if(choice==2) {
				System.out.println("blue colour...");
			}
			else if(choice==3) {
				System.out.println("green colour...");
			}
		}
		
	}
	/*
	 * 100% the parent class should be declared abstract
	 * abstract class is a special class used to represent the parent class, its a classfier class
	 * it provided a overview of the heirarchy which u create by extending this class..
	 * You cannot create an object of this class
	 * There is no compulsion to have any code inside the abstract class
	 */
	abstract class Paint{
		
	}
	class RedPaint extends Paint{
		
	}
	class BluePaint extends Paint{
		
	}
	class GreenPaint extends Paint{
		
	}

