package package1;

import package2.printing;

public class Operation extends Operation1{

	String  s="Hello";
	public int pubnumber;
	private int pvtnumber;
	protected int pctednumber;
	
	void def()
	{
		System.out.println("I am default");
		pubnum();
	}

 	public void pubnum()
	{

		System.out.println("I am public");
	}
	private void pvtnum()
	{
		System.out.println("I am private");
	}
	public void ptdnum()
	{
		System.out.println("I am protected");

	}
}




