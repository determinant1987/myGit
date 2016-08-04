package task2_3;

public class Calculator{
	 double a=2.5;
	 double b=5.1;
	 double result;
	
		public void plus (double a, double b){
			this.result=a+b;
		}
		
		public void minus (double a, double b){
			this.result=a-b;
		}
		
		public void multiply (double a, double b){
			this.result=a*b;
		}
		
		public void devide (double a, double b){
			if (b==0) throw new ArithmeticException("devide by null error"); 
				
			else this.result=a/b;
		}
		
		public void getResult (double result){
			System.out.println(result);
		} 
}

