package task4_2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class FactorialTest {
	
	@Test
	public void whenFactorial(){
		
		Factorial fac = new Factorial();
		
        int checked = 3628800;
			
        int result = fac.factorial(10);
        
		assertThat(result, is(checked));
        
	}
	
}