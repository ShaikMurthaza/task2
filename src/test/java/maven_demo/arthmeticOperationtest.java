package maven_demo;
import static org.junit.Assert.*;
import org.junit.Test;
public class arthmeticOperationtest {
   arthmeticOperation ao=new arthmeticOperation();
	@Test
	public void test_addtion() {
		assertEquals(16,ao.addtion(5, 11));}
	
	@Test
	public void test_subraction()
	{
		assertEquals(-6,ao.subraction(5, 11));
	}
  @Test	
  public void test_division()
  {
	  assertEquals(2, ao.division(11, 5));
  }
 @Test
 public void test_multiply()
 {
	 assertEquals(55,ao.multiply(5, 11));
 }
}
