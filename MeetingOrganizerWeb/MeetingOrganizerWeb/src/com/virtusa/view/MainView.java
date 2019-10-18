package com.virtusa.view;

import java.util.Scanner;
import com.virtusa.service.AdminService;
import com.virtusa.service.OrganizerService;

public class MainView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		AdminService adminService=new AdminService();
	    OrganizerService organizerService=new OrganizerService();
		int choice1=scanner.nextInt();
		switch(choice1) {
		case 1:adminService.login();
		break;
		case 2:organizerService.login();
		break;
		}
		System.out.println();
		while(true)
		{
			System.out.println("Welcome Admin");
		System.out.println("1.Add Room\n 2.Update Room\n 3.Delete Room\n 4.View All Information\n 5.Exit");	
		int choice=scanner.nextInt();
		switch(choice){
		case 1: adminService.addRoom();
		         break;
		
		case 2: adminService.updateRoom();
		 break;
			
		case 3: adminService.deleteRoom();
		 break;
		case 4: adminService.viewAllInfo();
		break;
		case 5:organizerService.login();
			System.out.println("Welcome Meeting Organizer");
			// adminService.viewAllInfo();
			 organizerService.org();
	default:
			System.out.println("choose number from given choice");
			}
		}
		}
}
