package testNG;

import org.testng.annotations.Test;

public class DependanciesEx {
	
	@Test(priority=0)
	public void highSchool() {
		System.out.println("HighSchool");
	}
	@Test(priority=1,dependsOnMethods="Degree")
	public void higherSchool() {
		System.out.println("HigherSchool");
	}

	@Test(priority=2,enabled=true)
	public void Degree() {
		System.out.println("degree");
	}


}
