// a Room Demo class to instantiate and display an object of volume class

public class RoomDemo{

	public static void main(String[] args){
		
		GetVolume value = new GetVolume(12.3,15.7,5); // instantiate an object of GetVolume class
		System.out.println("This is a volume of a room: " + value.volume()); // display the volume of the room
	
	}
}
	
