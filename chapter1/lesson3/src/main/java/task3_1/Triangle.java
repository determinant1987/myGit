package task3_1;

public class Triangle {

public Point a;
public Point b;
public Point c;


public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}

	public double area(){
	double ba = a.distanceTo(b);
	double ca = a.distanceTo(c);
	double bc = c.distanceTo(b);
	double halfP = (ba+ca+bc)/2;
	double square = Math.sqrt(halfP*(halfP-ba)*(halfP-ca)*(halfP-bc));
	return square;
	
	}
public static void main(String[] args){
	Point a1 = new Point(1.0, 8.0);
	Point a2 = new Point(4.0, 12.0);
	Point a3 = new Point(-10.0, 10.0);
	Triangle tr = new Triangle(a1,a2,a3);
	System.out.println(tr.area());
	MaxSide ms = new MaxSide();
	System.out.println(ms.max(tr));
	}
}

