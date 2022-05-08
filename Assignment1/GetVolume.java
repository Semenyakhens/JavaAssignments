//A class to calculate a volume of a class

public class GetVolume{

	private double length;
	private double width;
	private double height;
	
	
	public GetVolume(double len, double wid, double hgt){
		length = len;
		width = wid;
		height = hgt;
	}
	public void setLength(double len ){
	
		length = len;
	}
	public void setWidth(double wid){
	
		width = wid;
	}
	public void setHeight(double hgt){
	
		height = hgt;
	}
	public double volume(){ // a method to calculate the volume of a room
	
		return length * width * height;
	}
}	
	
	
	
	