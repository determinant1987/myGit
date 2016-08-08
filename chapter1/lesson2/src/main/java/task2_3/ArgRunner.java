package task2_3;

class ArgRunner {
	
	public static void main(String[] args){
		
		Calculator calc = new Calculator();
						
		calc.plus(calc.a, calc.b);
		System.out.println(calc.result);
		calc.minus(calc.a, calc.b);
		System.out.println(calc.result);
		calc.multiply(calc.a, calc.b);
		System.out.println(calc.result);
		calc.devide(calc.a, calc.b);
		System.out.println(calc.result);
	}
		
}