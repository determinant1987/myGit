package task4_2;

public class Factorial {

		public static void main(String[] args)
    {
        Factorial fac = new Factorial();
        System.out.println(fac.factorial(10));

    }

     public int factorial(int i)
    {
        int start = 1;
        for (int j=1;j<=i;j++){
            start=start*j;
        }
    return start;
    }
}

