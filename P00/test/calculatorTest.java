import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPositive() {
		//fail("Not yet implemented");
		int a = 8765;
		int b = 1234;
		
		calculator cal = new calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testAddNegative() {
		//fail("Not yet implemented");
		int a = -8765;
		int b = -1234;
		
		calculator cal = new calculator();
		int actual = cal.add(a,b);
		
		int expected = -9999;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		calculator cal = new calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 1111;
		
		calculator cal = new calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 5555;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 5555;
		int b = 1111;
		
		calculator cal = new calculator();
		int actual = cal.divide(a,b);
		
		int expected = 5;
		assertEquals(expected,actual);
		
	}

}
