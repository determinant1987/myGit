package task2_3;

public class Calculator{
	private double a=2.5;
	private double b=5.1;
	private double result;
	public static void main(String[] args){
		
		Calculator calc = new Calculator();
						
		calc.plus(calc.a, calc.b);
		calc.getResult(calc.result);
		calc.minus(calc.a, calc.b);
		calc.getResult(calc.result);
		calc.multiply(calc.a, calc.b);
		calc.getResult(calc.result);
		calc.devide(calc.a, calc.b);
		calc.getResult(calc.result);
	}
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