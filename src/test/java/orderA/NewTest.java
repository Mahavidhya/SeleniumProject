package orderA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends orderB 
{
  @Test
  public void TEST() {
	  
	  System.out.println("SUB CLASS-Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("SUB CLASS-BM");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("SUB CLASS-AM");
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("SUB CLASS-BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("SUB CLASS-AC");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("SUB CLASS-BT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("SUB CLASS-AT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("SUB CLASS-BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("SUB CLASS-AS");
  }

}
