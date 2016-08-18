package task3_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MaxSideTest {
	
	@Test
	public void whenComputeMax(){
		
		Point point1 = new Point(1.0, 8.0);
		Point point2 = new Point(4.0, 12.0);
		Point point3 = new Point(-10.0, 10.0);
        double checked = 14.142135623730951;
			
        Triangle triangle = new Triangle(point1, point2, point3);
		MaxSide ms = new MaxSide();
        
		assertThat(ms.max(triangle), is(checked));
        
	}
	
}