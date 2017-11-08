
public class RoomOccupancy {

	private int numberinRoom;
	static private int totalNumber = 0;

	public int getNumberinRoom() {
		return numberinRoom;
	}

	public void setNumberinRoom(int numinRoom) {
		numberinRoom = numinRoom;
	}

	public static int getTotalNumber() {
		return totalNumber;
	}

	public static void setTotalNumber(int totNumber) {
		totalNumber = totNumber;
	}

	// default
	public RoomOccupancy() {
		numberinRoom = 0;

	}

	public RoomOccupancy(int numinRoom, int totNumber) {
		numberinRoom = numinRoom;
		totalNumber = totNumber;
	}

	public void addOneToRoom() {
		numberinRoom++;
		totalNumber++;
		// return numberinRoom;
	}

	public void removeOneFromRoom() {
		if (numberinRoom > 0) {
			numberinRoom--;
			totalNumber--;
		} else {
			System.out.println("There is no one else to remove.");
		}
	}

	public int getNumber() {
		return numberinRoom;
	}

	static public int getTotal() {
		return totalNumber;
	}
}
