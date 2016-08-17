package task3_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class PointTest {
	
	@Test
	public void whenComputeDistanceTo(){
		
		Point point1 = new Point(1.0, 8.0);
		Point point2 = new Point(4.0, 12.0);
        double checked = 5.0;
		
		double result = point1.distanceTo(point2);

        assertThat(result, is(checked));
	}
	
}