package HotelBooking;

public class Room {
	
	private int roomNo;
	private int floorNo;
	private int occupancy;
	private boolean AC;
	private boolean status;
	private int pricePerDay;
	public int getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Room(int roomNo, int floorNo, int occupancy, boolean aC, boolean status) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.occupancy = occupancy;
		AC = aC;
		this.status = status;
	}
	
	
}
