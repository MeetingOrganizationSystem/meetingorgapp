package com.virtusa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



import com.virtusa.entities.Rooms;

public class AdminService {
		
		List<Rooms> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		

		public void addRoom() {
			Rooms r = new Rooms();
			System.out.println("Enter Floor Number.");
			r.setFloorNo(sc.nextInt());
			System.out.println("Enter Room Number");
			r.setRoomNo(sc.nextInt());
			System.out.println("Enter Room Type");
			r.setRoomType(sc.next());
			System.out.println("Enter Room Capacity");
			r.setRoomCapacity(sc.nextInt());
			
			
			list.add(r);
			
			for (Rooms r3 : list) {
				System.out.println(r3);
			}
		}



		public void updateRoom() {
			Rooms r1 = new Rooms();
			List<Rooms> list5 = new ArrayList<>();
			Iterator<Rooms> iter = list.iterator();
			while (iter.hasNext()) {
				Rooms r5=iter.next();
				System.out.println("Enter Floor Number");
				int r = sc.nextInt();

				if (r5.getFloorNo() == r) {       
					System.out.println("Enter New Floor Number to be updated");
					r5.setFloorNo(sc.nextInt());
					//int room = sc.nextInt()
					list5.add(r5);
					
					for (Rooms r4 : list5) {
						System.out.println(r4);
					}
					
				}
				else {
					System.out.println("Invalid Data");
				}
			}
			while(iter.hasNext()) {
				Rooms r5=iter.next();
				System.out.println("Enter Room Number");
				int r0=sc.nextInt();
				if(r5.getRoomNo()==r0) {
					System.out.println("Enter New Room Number to be updated");
					r5.setRoomNo(sc.nextInt());
					list5.add(r5);
					for(Rooms r4:list5) {
						System.out.println(r4);
					}
					
				}else {
					System.out.println("Invalid Data");
				}
			}
		}

		public void deleteRoom() {
			Rooms r2 = new Rooms();
			Iterator<Rooms> iter = list.iterator();
			System.out.println("Enter Room number to be deleted");
			int r3 = sc.nextInt();
			r2 = iter.next();
			if (r2.getFloorNo() == r3) {
				iter.remove();
				System.out.println("Deleted Succesfully");
				for (Rooms r4 : list) {
					System.out.println(r4);
				}
			} else {
				System.out.println("Invalid Data");
			}

		}
		public void viewAllInfo() {
			for (Rooms r4 : list) {
				System.out.println(r4);
			}
			
		}

		public void approval()
		{    
			System.out.println("Approved by admin");
		}
	public void login()
	{
		String username="admin";
		String password="admin@123";
		System.out.println("Enter Admin UserName");
		String name=sc.next();
		System.out.println("Enter Admin Password");
		String pwd=sc.next();
		if(username.equals(name)&& password.equals(pwd))
		{
			System.out.println("Logged in successfully");
		}
		else
		{
			System.out.println("Invalid Details");
			System.exit(0);
		}

}
}
