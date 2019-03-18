package maven_demo;
import static org.junit.Assert.*;
import org.junit.Test;
public class SimpleAndCompoundTest {
   SimpleAndCompound sac=new SimpleAndCompound();
	@Test
	public void test_SimpleInterest() {
	assertEquals(200, sac.simple(1000,2 ,10));
	}
	@Test
	public void test_CompoundInterest()
	{
		assertEquals(1210.0,sac.Compound(1000, 2, 10),0.1f);
	}
	
}
