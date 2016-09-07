package task4_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class SquareTest {
	
	@Test
	public void whenCalculate(){
		
		Square sq = new Square(-1.0f, 2.0f, 3.0f);
		
        float checked = -32.0f;
			
        float result = sq.calculate(-5);
        
		assertThat(result, is(checked));
        
	}
	
}