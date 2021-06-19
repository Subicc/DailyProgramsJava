package HITdayPrograms;

public class PBRArray {
	static int classVariable;
	int instantVariable;
	static int arr[]=new int[5];
	int arr1[]=new int[5];
	public static void main(String args[])
	{
		System.out.println(classVariable);
		PBRArray pbra=new PBRArray();
		System.out.println(pbra.instantVariable);
		int localVariable=0;
		System.out.println(localVariable);
		for(int i:arr)
		{
			System.out.println(i+"\t");
		}
		System.out.println();
		for(int i:pbra.arr1)
		{
			System.out.println(i+"\t");
		}
		System.out.println();
	
		int localArray[]=new int[5];
		for(int i:localArray)
		{
			System.out.println("loacl:"+i);
		}
		
		
	}	
	

}
