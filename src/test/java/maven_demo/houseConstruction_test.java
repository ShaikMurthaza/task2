package maven_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class houseConstruction_test {
    houseConstruction hc=new houseConstruction();
	@Test
	public void test() {
		assertEquals(2400,hc. amountForHouse("standard material",2));
	}

}
