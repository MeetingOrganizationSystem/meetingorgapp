package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.service.AdminService;
import com.virtusa.service.OrganizerService;

public class OrganizerView {
	Scanner scanner=new Scanner(System.in);
	OrganizerService organizerService=new OrganizerService();
	int choice=scanner.nextInt();
	
	    organizerService.login();
	   while(true) {
		   System.out.println("Welcome dear organizer");
		switch(choice)
		{
		case 1:organizerService.search();
	AdminService adminService=new AdminService();
	adminService.viewAllInfo();
	break;
	}
  }
}
}


