package com.virtusa.view;

import java.util.Scanner;
import com.virtusa.service.AdminService;
import com.virtusa.service.OrganizerService;

public class AdminView {
	Scanner scanner=new Scanner(System.in);
	AdminService adminService=new AdminService();
	{
		adminService.login();
		
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
    }
		
   }
	 
}
