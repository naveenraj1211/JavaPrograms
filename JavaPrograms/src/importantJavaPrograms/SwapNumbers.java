package importantJavaPrograms;

public class SwapNumbers {
	
	int num1 = 2,num2=6;
	
	
	public void swapNumbers1() 
	{
		int temp=num1+num2;
		num2=temp-num2;
		num1=temp-num2;
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		
	}
	
	public void swapNumbers2() 
	{

		num2=num1*num2; //12
		System.out.println("num2 ="+num2);
		
		num1=num2/num1;//12/2=6
		System.out.println("num1 ="+num1);
		
		num2=num2/num1; //12/6=2
		System.out.println("num2 ="+num2);
		
		
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		
	}
		
	
	
	public static void main(String[] args) 
	{
		SwapNumbers  numbers = new SwapNumbers();
		numbers.swapNumbers1();
		numbers.swapNumbers2();

	}

}
