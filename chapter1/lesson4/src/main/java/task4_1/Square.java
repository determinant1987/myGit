package task4_1;

public class Square {

		private float a; 
		private float b;
		private float c;
				
		Square (float a, float b, float c){
			this.a=a;
			this.b=b;
			this.c=c;
		}
	float calculate (int x){
		 return (float) (this.a*Math.pow(x,2)+this.b*x+this.c);
		 
	}
	
	void show ( int start, int finish, int step){
		for (int i = start; i <=finish;  i=i+step){
			System.out.println(calculate(i));
		}
	}

	 public static void main(String[] args){
		 Square sq = new Square(-1.0f, 2.0f, 3.0f);
		 sq.calculate(-5);
		 sq.show(1 , 6, 1 );
	 }
}

