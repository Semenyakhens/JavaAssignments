class FindSecondLarger{
	public static void main(String[] args){
	
	//declare an array of type int
	int [] arr = {5,200,3,60};
	
	//initialize int variables to help store values while sorting the array
	int temp = 0, temp2 = 0;
	
	//loop through the array to find the largest number in an array
	for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
					temp2 = arr[i];
                }
            }
        }
  
    System.out.println("The second highest number in the array is:"+ temp2);
    }
}
