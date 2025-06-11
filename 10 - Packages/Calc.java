import calculator.DoubleCalculator;

public class Calc
{
	public static void main(String args[])
	{
		DoubleCalculator c1=new DoubleCalculator();
		double r;
		r= c1.add(10.0,20.0);
		System.out.println("sum = "+r);
		r= c1.sub(10.0,20.0);
		System.out.println("diff = "+r);
		r= c1.mul(10.0,20.0);
		System.out.println("product = "+r);
		r= c1.div(10.0,20.0);
		System.out.println("division = " +r);
	}
}

/**
output:

>>javac -d . calculator/DoubleCalculator.java
>>javac Calc.java
>>java Calc

sum = 30.0
diff = -10.0
product = 200.0
div = 0.5

 */