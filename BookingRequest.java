package HotelBooking;

public class BookingRequest {
	private int floorNo;
	private int occupancy;
	private boolean AC;
	public int getFloorNo() {
		return floorNo;
	}
	public int getOccupancy() {
		return occupancy;
	}
	public boolean isAC() {
		return AC;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public BookingRequest(int floorNo, int occupancy, boolean aC) {
		super();
		this.floorNo = floorNo;
		this.occupancy = occupancy;
		AC = aC;
	}
	
	 
	
}
