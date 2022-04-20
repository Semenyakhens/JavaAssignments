
class ReverseHello{
	public static void main(String[] args)
	{
		//inititialize an array of characters
		char []letter = {'H','e','l','l','o'};
		
		//initialize a loop control variable
		int num = 4; 
		
		// loop to display characters starting from the last to the first
		while(num >= 0){
			System.out.println(letter[num]);
			--num;
		}
	
	}
}
			