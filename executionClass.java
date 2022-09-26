package HotelBooking;

import java.util.Scanner;

public class executionClass {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Booking booking=new Booking();
		while(true) {
			System.out.println("Enter Your Room Requirements");
			System.out.println("Enter floor number you want to choose");
			int floorNo=sc.nextInt();
			System.out.println("Enter how many of you want to stay in the room that is occupancy");
			int occupancy=sc.nextInt();
			System.out.println("do you want AC? enter true or false");
			boolean AC=sc.nextBoolean();
			
			booking.AllocateRoom(floorNo, occupancy, AC);
			
			
			
		}
		
		//System.out.println(br.getClass());
		//System.out.println(br.getFloorNo());

	}

}
