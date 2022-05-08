//a class to calculate average student marks 

class Student{
	
	private String name;
	private int [] marks;

	public Student(String first, int [] m){
		
		name = first;
		
		marks = m;
	}
		
	public void setName(String first){
		
		name = first;
	}
	
	public double calculateAverage(){
		
		double total = 0;
		double average = 0;
		for(int i = 0; i < 3; i++){
				total += marks[i];
		}
		return average = total / 3;
	
	}
	void displayStudent(){
		System.out.println("Student's name: "+name);
		System.out.println("The average marks: "+calculateAverage());
	}
}
