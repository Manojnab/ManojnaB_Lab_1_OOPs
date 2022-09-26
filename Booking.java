package HotelBooking;

import java.util.Scanner;

public class Booking {
	private int roomNo;
	private int floorNo;
	private Room[] room;
	Scanner sc=new Scanner(System.in);
	public Booking() {
		room=new Room[7];
		room[0]=new Room(101, 1, 1, true, false);
		room[1]=new Room(102, 1, 2, true, false);
		room[2]=new Room(103, 1, 2, false, false);
		room[3]=new Room(201, 2, 1, true, false);
		room[4]=new Room(202, 2, 1, false, false);
		room[5]=new Room(203, 2, 2, true, false);
		room[6]=new Room(204, 2, 3, true, false);
	}
	
	public void AllocateRoom(int fno,int occupancy,boolean ac ) {
		
		
		Hotel hotel=new Hotel(room, 5, "shanti Hotel", "bengaluru");
		boolean available=false;
		BookingRequest br=new BookingRequest(fno,occupancy,ac);
		for(int i=0;i<7;i++) {
			
			if(room[i].getFloorNo()==fno && room[i].isAC()==ac && room[i].getOccupancy()==occupancy && room[i].isStatus()==false) {
				
				
				available=true;
				if(room[i].getOccupancy()==1) {
					if(room[i].isAC()==true) {
						room[i].setPricePerDay(Utility.SINGLE_OCCUPANCY+Utility.AC_OCCUPANCY);

					}
					else {
						room[i].setPricePerDay(Utility.SINGLE_OCCUPANCY);

					}
				}
				else if(room[i].getOccupancy()==2) {
					if(room[i].isAC()==true) {
						room[i].setPricePerDay(Utility.DOUBLE_OCCUPANCY+Utility.AC_OCCUPANCY);

					}
					else {
						room[i].setPricePerDay(Utility.DOUBLE_OCCUPANCY);

					}
				}
				else if(room[i].getOccupancy()==3) {
					if(room[i].isAC()==true) {
						room[i].setPricePerDay(Utility.TRIPPLE_OCCUPANCY+Utility.AC_OCCUPANCY);

					}
					else {
						room[i].setPricePerDay(Utility.TRIPPLE_OCCUPANCY);

					}
				}
				System.out.println("room available and can be allocated the details of room number floor number and price is listed below");
				System.out.println("floor number allocated "+room[i].getFloorNo());
				System.out.println("room number allocated "+room[i].getRoomNo());
				System.out.println("price per day "+room[i].getPricePerDay());
				System.out.println("Hi customer do you want to confiem booking?enter true or false");
				boolean dicision=sc.nextBoolean();
				if(dicision==true) {
					room[i].setStatus(true);
					System.out.println("room blocked for you");
				}
				else {
					System.out.println("room not blocked");
				}
				break;
				
			} 
		}
		if(available==false) {
			System.out.println("Room not available with specified requirement");
		}
		
	}
}
