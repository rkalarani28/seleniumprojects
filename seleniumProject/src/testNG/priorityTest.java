package testNG;

import org.testng.annotations.Test;

public class priorityTest {
	
@Test(priority=1)
public void startCar() {
	System.out.println("start car");
}

@Test(priority=2)
public void firstGear() {
	System.out.println("firstgear");
}

@Test(priority=3)
public void secondGear() {
	System.out.println("secondgear");
}

@Test(priority=4)
public void thirdGear() {
	System.out.println("thirdgear");
}
}
