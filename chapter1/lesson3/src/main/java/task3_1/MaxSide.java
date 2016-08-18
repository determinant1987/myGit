package task3_1;

public class MaxSide {

	
	public double max(Triangle triangle){
		double ba = triangle.a.distanceTo(triangle.b);
		double ca = triangle.a.distanceTo(triangle.c);
		double bc = triangle.c.distanceTo(triangle.b);
		
		if((ba>=ca)&&(ba>bc)) return ba;
		else if ((ca>=ba)&&(ca>bc)) return ca;
		else return bc;
	
	}

}

