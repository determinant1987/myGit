package task3_1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class TriangleTest {
	
	@Test
	public void whenComputeArea(){
		
		Point point1 = new Point(1.0, 8.0);
		Point point2 = new Point(4.0, 12.0);
		Point point3 = new Point(-10.0, 10.0);
        double checked = 25.000000000000004;
			
        Triangle triangleTrue = new Triangle(point1, point2, point3);
        
		assertThat(triangleTrue.area(), is(checked));
        
	}
	
}