package TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	   public void testMulPass() {
	      // assertEquals(String message, long expected, long actual)
	      assertEquals("error in mul()",  2, Calculator.mul(1, 2));
	      assertEquals("error in mul()",  2, Calculator.mul(-1, -2));
	      assertEquals("error in mul()",  0, Calculator.mul(9, 0));
	   }
	 
	   @Test
	   public void testMulFail() {
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotEquals("error in mul()", 0, Calculator.mul(1, 2));
	   } 
	   
}
