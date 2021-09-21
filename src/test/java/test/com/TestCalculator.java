package test.com;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	
	CalculatorService service =  mock(CalculatorService.class);
	Calculator c;
	
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	
	@Test
	
	public void testAdd() {
		when(service.add(2, 10)).thenReturn(12);
		assertEquals(24, c.perform(2, 10));
	}

}
