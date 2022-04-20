class ExampleArray{
	public static void main(String[] args){
	
	//one-dimensional array
	
	int [] a = {10,20,30,50};
	int sum = 0;
	
	// loop to display array values
	for(int i = 0; i < 4; i++){
	
	System.out.println(a[i]);
	sum +=a[i];
	}

	System.out.println("The sum is: "+sum);
}
}	