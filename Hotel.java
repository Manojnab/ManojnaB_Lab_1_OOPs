package HotelBooking;

public class Hotel {
	private Room room[];
	private int starCategory;
	private String name;
	private String location;
	public Room[] getRoom() {
		return room;
	}
	public void setRoom(Room[] room) {
		this.room = room;
	}
	
	public int getStarCategory() {
		return starCategory;
	}
	public void setStarCategory(int starCategory) {
		this.starCategory = starCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Hotel(Room[] room, int starCategory, String name, String location) {
		super();
		this.room = room;
		this.starCategory = starCategory;
		this.name = name;
		this.location = location;
	}
	
	
}
