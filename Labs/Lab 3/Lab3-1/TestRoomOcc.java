
public class TestRoomOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		RoomOccupancy roomOne = new RoomOccupancy();
		RoomOccupancy roomTwo = new RoomOccupancy();
		
		for (int o= 0; o < 4; o++) // for loop to add 4 to room 1,  o for room 'one'
			roomOne.addOneToRoom();
		System.out.println("Room 1 total is: " + roomOne.getNumber());  //room 1 = 4
		
		for (int t = 0; t < 6; t++)
			roomTwo.addOneToRoom(); // for loop to add 6 to room 2, t for room 'two'
		System.out.println("Room 2 total is: " + roomTwo.getNumber());  // room 2 = 6
			
		System.out.println("Total ALL rooms: "+ RoomOccupancy.getTotal());  // 10
		
		for (int b = 0; b < 3; b++) // for loop to remove 3 from room 1 and room 2, b for 'both'
		{
			roomOne.removeOneFromRoom();  // remove 3
			roomTwo.removeOneFromRoom();  // remove 3
		}
		
		System.out.println("Room 1 total is: " + roomOne.getNumber());  // 1
		System.out.println("Room 2 total is: " + roomTwo.getNumber());  // 3  
		System.out.println("Total ALL rooms: "+ RoomOccupancy.getTotal());  // 4
		
		roomOne.removeOneFromRoom();  // remove 1 from room 1, room 1 = 0 now
		System.out.println("Room 1 total is: " + roomOne.getNumber());  // 0
		roomOne.removeOneFromRoom();  // show error
		System.out.println("Room 1 total is: " + roomOne.getNumber());  // 0
		System.out.println("Room 2 total is: " + roomTwo.getNumber());  // 3  
		System.out.println("Total ALL rooms: "+ RoomOccupancy.getTotal());  // 3   room 1 is 0, room 2 is 3
	}
}
