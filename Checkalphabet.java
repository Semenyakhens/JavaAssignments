import java.util.Scanner;
class Checkalphabet{
	public static void main (String[] args){
		
		char letter1 = 'a';
		char letter2 = 'e';
		char letter3 = 'i';
		char letter4 = 'o';
		char letter5 = 'u';
	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter letter");
		char letter = input.next().charAt(0);

if(letter ==letter1 || letter == letter2 || letter == letter3 || letter == letter4 || letter == letter5)
{
	System.out.println(letter + " is a consonant");
}
else{
	System.out.println(letter + " is not a consonant");
}
	
}
}
			
		
	
		
		
		
		