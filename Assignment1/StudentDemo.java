//demo for Student class

public class StudentDemo{

	public static void main(String[] args){
	
	int [] grades = {85,79,92};
	Student demo = new Student ("Khensani Semenya",grades);
	demo.calculateAverage();
	demo.displayStudent();
	}
}