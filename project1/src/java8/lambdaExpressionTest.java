package java8;

public class lambdaExpressionTest {
	
	public static void main(String[] args) {
		lambdaExpressionTest test =new lambdaExpressionTest();
		
		MathOperation addition = (int a,int b) -> a+b;
		
		MathOperation substraction =(a,b) -> a - b;
		
		MathOperation multiplication = (int a,int b) ->{return a*b;};
		
		MathOperation division = (int a, int b) -> a/b;
		
		MathOperation remainder = (int a, int b) -> a%b;
		
		System.out.println("10 + 5 = "+test.operate(10, 5, addition));
		
		System.out.println("20 - 12 = "+test.operate(20, 12, substraction));
		
		System.out.println("10 * 5 = "+test.operate(10, 5, multiplication));
		
		System.out.println("100 / 23 = "+test.operate(100, 23, division));
		
		System.out.println("100 % 23 = "+test.operate(100, 23, remainder));
		
		GreetingService greetingService = message -> System.out.println("Hello "+message);
		
		GreetingService greetingService2= message -> System.out.println("Hello "+message);
		
		greetingService.sayMessage("Min Ko");
		
		greetingService.sayMessage("Ko Ko");
	}

	

		interface MathOperation {
			int operation(int a,int b);
		}
		interface GreetingService{
			void sayMessage(String message);
		}
		private int operate(int a, int b,MathOperation mathOperation) {
			return mathOperation.operation(a, b);
		}

}
