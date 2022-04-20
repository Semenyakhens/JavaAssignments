import java.util.Scanner;
class FindVowel{
  
  public static void main(String[] args) {
  
	// create an object of class Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt user to enter a word
	System.out.println("Enter word");
	
    // declare a string variable to get text from user
	String  line = input.nextLine();
	
	//loop through the text to find vowels and where they are located
    for(int i=0; i<line.length(); i++) {
		
    if(line.charAt(i) == 'a'|| line.charAt(i) == 'e'|| line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u'){
        System.out.println("Yes " + line.charAt(i)+" at position" + i);
	}
	
	}
	
}
}