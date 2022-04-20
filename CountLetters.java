import java.util.Scanner;
class CountLetters{
	public static void main(String[] arg){
	
	// create an object of class Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt user to enter a word
	System.out.println("Enter word");
	
	// declare a string variable 
	String word = input.nextLine();
	
	//declare loop control variable to calculate how many characters are there in a word.
	int num = 0;
	while(num < word.length()){
	++num;	
	}
	System.out.println("The word has "+ num +"letters");
	}
}
	
	
	
	
	
	