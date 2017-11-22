package orderA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class orderB {
	
	 
	  @BeforeMethod
	  public void beforeMethod1() {
		  System.out.println("SUPER CLASS-BM");
	  }

	  @AfterMethod
	  public void afterMethod1() {
		  System.out.println("SUPER CLASS-AM");
	  }


	  
	  @BeforeClass
	  public void beforeClass1() {
		  System.out.println("SUPER CLASS-BC");
	  }

	  @AfterClass
	  public void afterClass1() {
		  System.out.println("SUPER CLASS-AC");
	  }

	  @BeforeTest
	  public void beforeTest1() {
		  System.out.println("SUPER CLASS-BT");
	  }

	  @AfterTest
	  public void afterTest1() {
		  System.out.println("SUPER CLASS-AT");
	  }

	  @BeforeSuite
	  public void beforeSuite1() {
		  System.out.println("SUPER CLASS-BS");
	  }

	  @AfterSuite
	  public void afterSuite1() {
		  System.out.println("SUPER CLASS-AS");
	  }

}
