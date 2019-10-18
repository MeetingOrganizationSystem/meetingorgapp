package com.virtusa.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.virtusa.entities.Rooms;

public class OrganizerService {
	
	
		
		boolean b1;
		Scanner sc=new Scanner(System.in);
		AdminService as=new AdminService();
		Rooms rb=new Rooms();
		//LocalDate currentDate=LocalDate.now();
	    
		
		public void search()
		{
			System.out.println("Enter available Room number to be booked");
			int r=sc.nextInt();
		String s1="available";
			if(s1.equals("available"))
			{
				System.out.println("Room is available\n Room booked");
				
				b1=true;
				as.approval();
				System.out.println("Enter meeting date");
				String date=sc.next();
				System.out.println("Enter meeting start time");
				String st=sc.next();
				System.out.println("Enter meeting end time");
				String et=sc.next();
				System.out.println("Meeting Date:"+LocalDate.now()+"  Meeting start time:"+LocalTime.now()+"  Meeting end time:"+et);
				System.out.println("Booking Complete Successfully...");
				System.exit(0);
			}
			else
			{
				b1=false;
				System.out.println("Cancel or reschedule the meeting");
			}
		}
		
		
		public void org()	
		
		{
			//System.out.println("Welcome Meeting Organizer");
			search();
		}
		
		
		public void login()
		{
			String username="meeting";
			String password="meeting@123";
			System.out.println("Enter MeetingOrganizer UserName");
			String name=sc.next();
			System.out.println("Enter MeetingOrganizer Password");
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
