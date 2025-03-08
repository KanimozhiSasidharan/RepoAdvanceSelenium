package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest2 
{
	@Test
	public void m1()
	{
		//Eng 2
		//Eng 1
		//modified code
		 System.out.println("step1");
		 System.out.println("step2");
		 SoftAssert soft = new SoftAssert();
		 soft.assertEquals(true, false);
		 System.out.println("step3");
		 System.out.println("step4");
		 soft.assertAll();
	}
}
