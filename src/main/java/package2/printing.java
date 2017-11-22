package package2;

import org.testng.annotations.DataProvider;

public class printing {
	
	int i=1;
	
	@DataProvider
	public void check()
	{
		System.out.println(i);
	}
	
	}


