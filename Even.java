import java.util.Scanner;
class Even{
	
	public static void main(String[] args){
		
		int num1 , num2;
		int quotient, remainder;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		
		quotient = num2 / num1;
		remainder = num2 % num1;
		
		if (remainder == 0 ){
			System.out.println( "Num1 :is even ");
		}
		else{
		System.out.println("Num2: is odd");
		}	
	}
}	