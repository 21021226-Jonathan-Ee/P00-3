import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 8888;
		int b = 1111;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 7777 ;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 6378;
		int b = 5312;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 33879936 ;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 68;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 17 ;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented");
		int a = 68;
		int b = 0;
		
		
		try {
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported",e.getMessage());	
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown",t.getMessage());
		}
		}
	
	

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	

	

}
