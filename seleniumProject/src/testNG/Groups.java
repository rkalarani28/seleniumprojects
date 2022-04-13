package testNG;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = {"group1","group2"})
	public void firstCase() {
		System.out.println("TestNG1");
	}
	
	@Test(groups= {"group2"})
	public void secondCase() {
		System.out.println("TestNG2");
	}
	
	@Test(groups= {"group1"})
	public void thirdCase() {
		System.out.println("TestNG3");
	}
	
	@Test(groups= {"group2"})
	public void fourCase() {
		System.out.println("TestNG4");
	}

}
