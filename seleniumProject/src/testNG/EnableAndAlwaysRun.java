package testNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class EnableAndAlwaysRun {
	@Test
	public void startCar() {
		System.out.println("start car");
	}

	@Test(enabled=false,alwaysRun=true)
	public void firstGear() {
		System.out.println("firstgear");
	}

	@Test
	public void secondGear() {
		System.out.println("secondgear");
		throw new NoSuchElementException("element not present");
	}

	@Test(dependsOnMethods = "secondGear",alwaysRun = true)
	public void thirdGear() {
		System.out.println("thirdgear");
	}

}
