import java.util.Scanner;

class Findlarger{

public static void main (String[] args){

	int a, b, c;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter three numbers");
	
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	
	if(a > b && a > c){
            System.out.println("Largest number is:"+a);
        }
        else if(b > c){
            System.out.println("Largest number is:"+b);
        }
        else{
            System.out.println("Largest number is:"+c);
        }
	}
}
	
	