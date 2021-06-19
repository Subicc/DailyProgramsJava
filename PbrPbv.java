package HITdayPrograms;

public  class PbrPbv {

	public static void main(String args[]) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println("Intial size of Laddu:"+laddu.getSize());
		PBV pbvobj=new PBV();
		pbvobj.modifyLadduSize(laddu.size);
		System.out.println("Size of Laddu after PBV:"+laddu.getSize());
		
		PBR pbrobj=new PBR();
		pbrobj.modifyLadduSize(laddu);
		System.out.println("Size of laddu after pbr:"+laddu.getSize());
	}
		}
 	class  Laddu{
		int size;
		public void setSize(int size)
		{
			this.size=size;
		}
		public int getSize()
		{
			return this.size;
		}
		
	}
	class PBV{
		public void modifyLadduSize(int size) {
			size=size-5;
			}
		}
	class PBR{
		
		 public void modifyLadduSize(Laddu laddu) {
			laddu.setSize(5);
		}
	}


